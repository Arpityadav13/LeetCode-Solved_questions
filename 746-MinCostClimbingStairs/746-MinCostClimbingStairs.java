// Last updated: 6/3/2026, 11:21:10 PM
1class Solution {
2    int[] t;
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        t = new int[n+1];
6        Arrays.fill(t,-1);
7        return solve(cost , n);
8    }
9    public int solve(int[] cost , int n){
10        if(n==0 || n==1){
11            return 0;
12        }
13        if(t[n] != -1){
14            return t[n];
15        }
16        int left =  solve(cost , n-1) + cost[n-1];
17        int right = solve(cost , n-2) + cost[n-2];
18        return t[n] =  Math.min(left,right);
19    }
20}