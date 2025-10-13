// Last updated: 10/13/2025, 11:29:44 PM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m =grid.length;
        int n = grid[0].length;
        int firstrow= x;
        int lastrow=x+k-1;
        
        while(firstrow<lastrow){
            for(int j=0;j<k;j++){
                    int temp=grid[firstrow][y+j];
                    grid[firstrow][y+j]=grid[lastrow][y+j];
                    grid[lastrow][y+j]=temp;}
                    firstrow++;
                    lastrow--;
                
                
        }
        return grid;
    }
}