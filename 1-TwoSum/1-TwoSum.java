// Last updated: 10/27/2025, 11:28:34 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int list[] = new int[2];
        int i =0;
        while(i<nums.length){
            for(int n =i+1;n<nums.length;n++){
                if(nums[i]+nums[n]==target){
                    list[0]=i;
                    list[1]=n;
                }
            }
            i++;
        }
        return list;
    }
}