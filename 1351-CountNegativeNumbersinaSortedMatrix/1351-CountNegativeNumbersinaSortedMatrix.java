// Last updated: 12/28/2025, 8:57:55 AM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int output = 0;
4        for(int i = 0 ; i<grid.length;i++){
5            for(int j = 0;j<grid[0].length;j++){
6                if(grid[i][j]<0){
7                    output++;
8                }
9            }
10        }
11        return output;
12    }
13}