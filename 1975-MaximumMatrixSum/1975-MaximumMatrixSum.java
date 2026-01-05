// Last updated: 1/5/2026, 10:18:26 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        long totalsum = 0;
4        int count =0;
5        int minvalue =Integer.MAX_VALUE;
6        for(int i = 0;i<matrix.length;i++){
7            for(int j= 0; j<matrix[0].length;j++){
8                totalsum+=Math.abs(matrix[i][j]);
9                if(matrix[i][j]<0){
10                    count++;
11                }
12                minvalue = Math.min(minvalue,Math.abs(matrix[i][j]));
13
14            }
15        }
16        if(count%2==0){
17            return totalsum;
18        }else{
19            return totalsum-2*minvalue;
20        }
21    }
22}