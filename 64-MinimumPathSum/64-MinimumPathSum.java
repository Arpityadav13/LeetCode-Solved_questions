// Last updated: 6/1/2026, 11:22:37 PM
1class Solution {
2    int[][] t = new int[101][101];
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        int m = obstacleGrid.length;
5        for(int i = 0;i<m;i++){
6            Arrays.fill(t[i],-1);
7        }
8        int n = obstacleGrid[0].length;
9        return solve(obstacleGrid,m-1,n-1);
10    }
11    public int solve(int[][] obstacleGrid,int m , int n){
12        if(n<0 || m<0){
13            return 0;
14        }
15        if(obstacleGrid[m][n] == 1){
16            return 0;
17        }
18        if(n==0 && m==0){
19            return 1;
20        }
21        if(t[m][n] != -1){
22            return t[m][n];
23        }
24        int left  = obstacleGrid[m][n] + solve(obstacleGrid,m,n-1);
25        int right  =  solve(obstacleGrid,m-1,n);
26        return t[m][n] = left+right;
27    }
28}