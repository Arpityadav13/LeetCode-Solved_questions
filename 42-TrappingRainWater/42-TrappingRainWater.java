// Last updated: 10/13/2025, 11:32:17 PM
class Solution {
    public int trap(int[] height) {
        int Maxleft [] = new int[height.length];
        int Maxright [] = new int[height.length];
        int maxleft = Integer.MIN_VALUE;
        int maxright = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++) {
            if(maxleft < height[i]) {
                maxleft = height[i];
            }
            Maxleft[i] = maxleft;
        }
        for(int i = height.length - 1; i >= 0; i--) {
            if(maxright < height[i]) {
                maxright = height[i];
            }
            Maxright[i] = maxright;
        }
        int water = 0;
        for(int i = 0; i < height.length; i++) {
            water += Math.min(Maxleft[i], Maxright[i]) - height[i];
        }
        return water;
    }
    }
