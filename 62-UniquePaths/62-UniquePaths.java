// Last updated: 6/1/2026, 9:01:31 AM
1class Solution {
2    int[][] t = new int[101][101];
3    public int uniquePaths(int m, int n) {
4        for (int i = 0; i <= m; i++) {
5    Arrays.fill(t[i], -1);
6}
7        return solve(m,n);
8        
9    }
10    public int solve(int m, int n){
11        if(m==1 || n==1){
12            return 1;
13        }
14        if(m==0 || n==0){
15            return 0;
16        }
17        if(t[m][n] != -1){
18            return t[m][n];
19        }
20        int left =  solve(m,n-1);
21        int right  = solve(m-1,n);
22        return t[m][n] = left+right;
23    }
24}