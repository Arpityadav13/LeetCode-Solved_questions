// Last updated: 10/13/2025, 11:31:12 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        int rem=0;
        while(n>0 && rem==0){
            if(n==1){
                return true;
            }
             rem=n%4;
            n=n/4;
        }
        return false;
    }
}