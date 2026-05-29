// Last updated: 5/29/2026, 10:02:30 PM
1class Solution {
2    int[][] t = new int[501][501];
3    public int minDistance(String word1, String word2) {
4        int lcs = lcs(word1,word2,word1.length(),word2.length());
5        return (word1.length()-lcs)+(word2.length()-lcs);
6    }
7    public int lcs(String word1, String word2,int m , int n){
8        for(int i = 0;i<=m;i++){
9            for(int j = 0;j<=n;j++){
10                if(i==0 || j==0){
11                    t[i][j]=0;
12                }
13            }
14        }
15        for(int i= 1;i<=m;i++){
16            for(int j = 1;j<=n;j++){
17                if(word1.charAt(i-1) == word2.charAt(j-1)){
18                    t[i][j] = 1 + t[i-1][j-1];
19                }else{
20                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
21                }
22            }
23        }
24        return t[m][n];
25    } 
26}