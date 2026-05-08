// Last updated: 5/8/2026, 3:53:17 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currsum = nums[0];
4        int maxsum = nums[0];
5        for(int i= 1 ;i<nums.length;i++){
6            currsum = Math.max(currsum+nums[i],nums[i]);
7            maxsum = Math.max(maxsum,currsum);
8        }
9        return maxsum;
10    }
11}