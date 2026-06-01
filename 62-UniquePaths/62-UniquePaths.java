// Last updated: 6/1/2026, 9:03:31 AM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return findPath(m-1,n-1,dp);
    }
    int findPath(int r, int c, int[][] dp){
        if(r == 0 || c == 0){
            return 1;
        }
        if(dp[r][c] != 0){
            return dp[r][c];
        }
        dp[r][c] =  findPath(r-1,c,dp) + findPath(r,c-1,dp);
        return dp[r][c];
    }
}