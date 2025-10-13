// Last updated: 10/13/2025, 11:31:16 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int num : nums){
            if(num != 0){
                nums[position++] = num;
            }
        }
        while(position < nums.length){
            nums[position++] = 0;
        }
    }
}