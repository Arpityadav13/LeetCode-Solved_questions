// Last updated: 4/6/2026, 10:34:34 PM
1class Solution {
2    public int numTrees(int n) {
3        int[] dp = new int[n + 1];
4        
5        dp[0] = 1;
6        dp[1] = 1;
7
8        for (int i = 2; i <= n; i++) {
9            for (int root = 1; root <= i; root++) {
10                dp[i] += dp[root - 1] * dp[i - root];
11            }
12        }
13        return dp[n];
14    }
15}