// Last updated: 12/30/2025, 12:18:44 AM
1class Solution {
2    public int generateKey(int num1, int num2, int num3) {
3        int ans = 0, x = 1;
4        while(num1 > 0 || num2 > 0 || num3 > 0) {
5            int min_digit = Math.min((num1 % 10) , (num2 % 10));
6            min_digit = Math.min((num3 % 10) , min_digit);
7            ans += x * min_digit;
8            x *= 10;
9            num1 /= 10;
10            num2 /= 10;
11            num3 /= 10;
12        }
13        return ans;
14    }
15}