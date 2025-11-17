// Last updated: 11/17/2025, 10:56:17 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i]==1){
               if(prev>=0 && k>Math.abs(i-prev-1)){
                    return false;

               }
               prev= i;
            }
        }
    
        return true;
    }
}