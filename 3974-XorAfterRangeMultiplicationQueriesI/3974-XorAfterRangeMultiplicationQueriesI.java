// Last updated: 10/13/2025, 11:29:45 PM
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int mod = 1_000_000_007;
        int[][] mor =queries;
        for(int[] querie : queries){
            int x =querie[0],y=querie[1],z=querie[2],a=querie[3];
            for(int i=x;i<=y;i+=z){
                nums[i]= (int)((1L*nums[i]*a)%mod);
            }
        }
        int ans =0;
        for(int n:nums){
            ans^=n;
        }
        return ans;
    }
}