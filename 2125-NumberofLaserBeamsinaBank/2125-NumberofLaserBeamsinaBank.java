// Last updated: 10/27/2025, 5:08:39 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans =0;
        int prev =0;

        for(String laser : bank){
            int sum =0;
                
            for(int j =0;j<laser.length();j++){
                if(laser.charAt(j)=='1'){
                    sum++;
                }
        }
                if(sum>0){
            ans+= prev *sum;
            prev =sum;
            }}
        return ans;
    }
}