// Last updated: 5/31/2026, 1:48:08 PM
1class Solution {
2    public int minInsertions(String s) {
3        String p  = new StringBuilder(s).reverse().toString();
4        int m  = s.length();
5        int n = p.length();
6        int[][] t = new int[m+1][n+1];
7        for(int i = 0;i<=m;i++){
8            for(int j  =0 ;j<=n;j++){
9                if(i==0 || j==0){
10                    t[i][j] = 0;
11                }
12            }
13        }
14        for(int i =1;i<=m;i++){
15            for(int j = 1;j<=n;j++){
16                if(s.charAt(i-1) == p.charAt(j-1)){
17                    t[i][j] = 1 + t[i-1][j-1];
18                }else{
19                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
20                }
21            }
22        }
23        return m - t[m][n];
24    }
25}