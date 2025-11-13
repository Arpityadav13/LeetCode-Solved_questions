// Last updated: 11/13/2025, 7:13:14 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] == 1) {
                count++; 
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0; 

        }}
        
        return maxcount;
    }
}