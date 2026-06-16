// Last updated: 6/16/2026, 9:04:44 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        
4        for (int i = 0; i < matrix.length; i++) { 
5            for(int j = i;j<matrix[i].length;j++){
6                int temp = matrix[i][j];
7                matrix[i][j]=matrix[j][i];
8                matrix[j][i]=temp;
9            
10                
11    }}
12    for (int i = 0; i < matrix.length; i++) {
13    for (int j = 0; j < matrix[i].length / 2; j++) {
14        int temp = matrix[i][j];
15        matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
16        matrix[i][matrix[i].length - 1 - j] = temp;
17    }
18}
19
20    
21
22    }}