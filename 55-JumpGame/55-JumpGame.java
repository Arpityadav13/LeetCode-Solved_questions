// Last updated: 10/13/2025, 11:32:12 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxdis=0;
        for(int i= 0;i<nums.length;i++){
            if(i>maxdis) return false;
            maxdis=Math.max(maxdis,i+nums[i]);
        }
        return true;
    }
}