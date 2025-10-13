// Last updated: 10/13/2025, 11:30:19 PM
class Solution {
    public int maxProduct(int[] nums) {
        int largest=0,seclarg=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>largest){
                seclarg=largest;
                largest=nums[i];

            }else if(nums[i]>seclarg){
                seclarg=nums[i];}
            }
        
        return (largest-1)*(seclarg-1);
    }
}