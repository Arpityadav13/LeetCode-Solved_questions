// Last updated: 1/10/2026, 9:25:30 AM
1class Solution {
2    public int myAtoi(String s) {
3
4        int i = 0, sign = 1, result = 0;
5
6        // 1️⃣ skip spaces
7        while (i < s.length() && s.charAt(i) == ' ') i++;
8
9        // 2️⃣ sign
10        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
11            sign = (s.charAt(i) == '-') ? -1 : 1;
12            i++;
13        }
14
15        // 3️⃣ digits with overflow check
16        while (i < s.length() && Character.isDigit(s.charAt(i))) {
17            int digit = s.charAt(i) - '0';
18
19            // overflow check
20            if (result > Integer.MAX_VALUE / 10 ||
21               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
22                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
23            }
24
25            result = result * 10 + digit;
26            i++;
27        }
28
29        return result * sign;
30    }
31}
32