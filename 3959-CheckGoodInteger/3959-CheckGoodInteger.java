// Last updated: 6/15/2026, 9:55:04 PM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int digitsum = 0;
4        int sqsum =0;
5        while(n>0){
6            int g = n%10;
7            digitsum = digitsum +g;
8            sqsum = sqsum + g*g;
9            n= n/10;
10        }
11        if(sqsum-digitsum>=50){
12            return true;
13        }
14        return false;
15    }
16}