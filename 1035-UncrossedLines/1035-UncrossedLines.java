// Last updated: 5/31/2026, 1:05:50 PM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int m = nums1.length;
4        int n = nums2.length;
5
6        int[][] t = new int[m+1][n+1];
7        for(int i = 0;i<=m;i++){
8            for(int j = 0 ; j<=n;j++){
9                if( i == 0 || j==0){
10                    t[i][j] =0;
11                }
12            }
13        }
14        for(int i =1 ;i<=m;i++){
15            for(int j =1;j<=n;j++){
16                if(nums1[i-1] == nums2[j-1]){
17                    t[i][j] = 1 + t[i-1][j-1];
18                }else{
19                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
20                }
21            }
22        }
23
24        return t[m][n];
25    }
26}