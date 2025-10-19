// Last updated: 10/19/2025, 3:45:57 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] surfix = new int[nums.length];
        prefix[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];

        }
        surfix[nums.length-1] =nums[nums.length-1];

        for (int i = nums.length-2; i>=0; i--) {
            surfix[i] = nums[i] + surfix[i + 1];

        }
        for (int i = 0; i < nums.length; i++){
            if(prefix[i]==surfix[i]){
                return i;
            }
        }

            
        return -1;
        }
    
}