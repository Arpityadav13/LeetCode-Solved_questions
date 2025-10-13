// Last updated: 10/13/2025, 11:31:25 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}