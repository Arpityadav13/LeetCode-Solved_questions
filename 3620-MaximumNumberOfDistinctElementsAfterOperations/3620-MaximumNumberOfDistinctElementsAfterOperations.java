// Last updated: 10/22/2025, 9:07:04 PM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        for(int i = 0 ; i <nums.length;i++){
            int minvalue = nums[i]-k;
            if(prev<minvalue){
                prev = minvalue;
                count++;
            }else if(prev < nums[i]+k){
                prev =prev+1;
                count++;

            }
           

        }
        return count;
    }
}