// Last updated: 11/12/2025, 6:10:50 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans =new int[2*n];
        for(int i =0;i<2*n;i++){
            
                ans[i]=nums[i%n];
            
    }
    return ans;
}}