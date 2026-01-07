// Last updated: 1/7/2026, 7:50:05 PM
1class Solution {
2    public int tribonacci(int n) {
3        int[] dp=new int[n+1];
4        return tribo(n,dp);  
5    }
6    public int tribo(int n,int[]  dp){
7        if(n==0) return 0;
8        if(n==1) return 1;
9        if(n==2) return 1;
10        if(dp[n]!=0) return dp[n];
11        return dp[n]=tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
12    }
13}