// Last updated: 5/30/2026, 2:45:26 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        String g= "";
4         for (int left = 0; left < s.length(); left++) {
5            for (int right = left; right < s.length(); right++) {
6                String substring = s.substring(left, right + 1);
7
8                if (isPalindrome(substring) && substring.length() > g.length()) {
9                    g = substring;
10                }
11            }
12        }
13        return g;
14    }
15    public static boolean isPalindrome(String str) {
16        int left = 0;
17        int right = str.length() - 1;
18
19        while (left < right) {
20            if (str.charAt(left) != str.charAt(right)) {
21                return false;
22            }
23            left++;
24            right--;
25        }
26
27        return true;
28    }
29
30}