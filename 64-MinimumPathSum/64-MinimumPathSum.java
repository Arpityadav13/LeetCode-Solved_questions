// Last updated: 6/1/2026, 11:24:00 PM
1class Solution {
2    int[][] t;
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4
5        int m = obstacleGrid.length;
6        int n = obstacleGrid[0].length;
7        t  = new int[m][n];
8        for(int i = 0;i<m;i++){
9            Arrays.fill(t[i],-1);
10        }
11        return solve(obstacleGrid,m-1,n-1);
12    }
13    public int solve(int[][] obstacleGrid,int m , int n){
14        if(n<0 || m<0){
15            return 0;
16        }
17        if(obstacleGrid[m][n] == 1){
18            return 0;
19        }
20        if(n==0 && m==0){
21            return 1;
22        }
23        if(t[m][n] != -1){
24            return t[m][n];
25        }
26        int left  = obstacleGrid[m][n] + solve(obstacleGrid,m,n-1);
27        int right  =  solve(obstacleGrid,m-1,n);
28        return t[m][n] = left+right;
29    }
30}