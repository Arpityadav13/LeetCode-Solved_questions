// Last updated: 10/13/2025, 11:32:21 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] index = {-1,-1};
        index[0]=binary(nums,target,true);
        index[1]=binary(nums,target,false);
        return index;
        
        
        
    }
    static int binary(int[] nums,int target,boolean find){
        int start = 0 ;
         int end = nums.length-1;
         int ans = -1;
         while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
                }
            else if(nums[mid]>target){
                end=mid-1;
            }else{
                ans=mid;
                if(find){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
         }
         return ans;
    }
}