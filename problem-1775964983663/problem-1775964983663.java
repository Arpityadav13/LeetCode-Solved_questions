// Last updated: 4/12/2026, 9:06:23 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int[] output = new int[matrix[0].length];
4        int n  = matrix.length;
5        int m  = matrix[0].length;
6        
7        for(int i = 0;i<n;i++){
8            int k = 0;
9            for(int j = 0;j<m;j++){
10                if(matrix[i][j]==1){
11                    k++;
12                }
13            }
14            output[i]=k;
15        }
16        return output;
17    }
18}