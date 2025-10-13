// Last updated: 10/13/2025, 11:32:33 PM
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(left<=right){
            int h = Math.min(height[left],height[right]);
            int width = right-left;
            int currarea= width*h;
            if(currarea>maxarea){
                maxarea=currarea;
            }else if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}