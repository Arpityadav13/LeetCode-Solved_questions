// Last updated: 4/18/2026, 9:50:38 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        
4        int temp = n;
5        int rev = 0;
6
7        while (n != 0) {
8            int digit = n % 10;     
9            rev = rev * 10 + digit; 
10            n = n / 10;             
11        }
12
13        return Math.abs(temp-rev);
14    }
15}