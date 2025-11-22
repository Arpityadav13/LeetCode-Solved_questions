// Last updated: 11/22/2025, 2:49:26 PM
class Solution {
    public long minimumReplacement(int[] nums) {
        long least = nums[nums.length-1];
        long count =0 ;
        
        for(int i =nums.length-2;i>=0;i--){
            long cur =nums[i];
            if(cur<=least){
                least=cur;
               
            }else{
                long parts = (cur+least-1)/least;
                count+=parts-1;
                least=cur/parts;

           
            
        }}
        return count;
    }
}