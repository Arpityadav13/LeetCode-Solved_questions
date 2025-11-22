// Last updated: 11/22/2025, 10:48:36 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int output=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%3!=0){
                
                output++;
            }
        }
        return output;
    }
}