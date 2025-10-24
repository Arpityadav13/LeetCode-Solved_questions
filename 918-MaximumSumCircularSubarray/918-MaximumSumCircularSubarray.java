// Last updated: 10/24/2025, 5:39:38 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int minSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        int circularsum=sum-minSum;
        int maxSum =maxSubArray(nums);
        if(maxSum>0){
            maxSum =Math.max(maxSum,circularsum);
        }
        return maxSum;
       
    }

    
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}