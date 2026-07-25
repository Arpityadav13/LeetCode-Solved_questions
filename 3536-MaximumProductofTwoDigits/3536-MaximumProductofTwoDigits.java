// Last updated: 7/25/2026, 8:33:03 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0;
4        int max2 = 0;
5
6        while (n > 0) {
7            int digit = n % 10;
8
9            if (digit >= max1) {
10                max2 = max1;
11                max1 = digit;
12            } else if (digit > max2) {
13                max2 = digit;
14            }
15
16            n /= 10;
17        }
18
19        return max1 * max2;
20    }
21}