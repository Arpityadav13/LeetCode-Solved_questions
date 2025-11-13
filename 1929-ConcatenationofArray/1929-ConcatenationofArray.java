// Last updated: 11/13/2025, 7:35:03 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k =n;
        int m =0;
        int[] out = new int[nums.length];
        for(int i = 0 ; i<nums.length-1;i++){
            out[i]=nums[m];
            out[i+1]=nums[k];
            k++;
            i++;
            m++;
        }
            
        
        return out;
    }
}