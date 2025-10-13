// Last updated: 10/13/2025, 11:30:53 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k =0 ;
        int max=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }else{
                max=Math.max(max,k);
                k=0;
            }

        }
        max=Math.max(max,k);
        return max;
        
    }
}