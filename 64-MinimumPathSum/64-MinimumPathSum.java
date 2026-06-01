// Last updated: 6/1/2026, 5:24:19 PM
1class Solution {
2    int[][] t = new int[201][201];
3    public int minPathSum(int[][] grid) {
4        int m = grid.length;
5        for (int i = 0; i <= m; i++) {
6    Arrays.fill(t[i], -1);
7}
8        int n  = grid[0].length;
9        return solve(grid , m-1,n-1);
10    }
11    public int solve(int[][] grid , int m,int n ){
12        if(n==0 && m == 0){
13            return grid[0][0];
14        } if (m < 0 || n < 0) {
15            return Integer.MAX_VALUE;
16        }
17        if(t[m][n] != -1){
18            return t[m][n];
19        }
20
21        int left = solve(grid,m,n-1);
22        int right = solve(grid,m-1,n);
23        return t[m][n] = grid[m][n] + Math.min(left,right);
24
25    }
26}