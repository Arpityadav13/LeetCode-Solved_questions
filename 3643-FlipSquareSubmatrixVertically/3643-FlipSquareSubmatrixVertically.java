// Last updated: 3/22/2026, 12:58:04 AM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int m =grid.length;
4        int n = grid[0].length;
5        int firstrow= x;
6        int lastrow=x+k-1;
7        
8        while(firstrow<lastrow){
9            for(int j=0;j<k;j++){
10                    int temp=grid[firstrow][y+j];
11                    grid[firstrow][y+j]=grid[lastrow][y+j];
12                    grid[lastrow][y+j]=temp;}
13                    firstrow++;
14                    lastrow--;
15                
16                
17        }
18        return grid;
19    }
20}