// Last updated: 10/13/2025, 11:29:43 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int range = 2*k+1;
        int r=(n+range-1)/range;
        int c=(m+range-1)/range;
        return r*c;
    }
}