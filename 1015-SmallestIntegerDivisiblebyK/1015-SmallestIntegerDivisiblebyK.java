// Last updated: 11/25/2025, 11:55:37 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k==1){
            return 1;
        }
        if(k%2==0 && k%5==0){
            return -1;
        }
        int res = 0;
        for(int i =1;i<=k;i++){
            res =(res*10+1)%k;
            if(res==0){
                return i;
            }
        }
        return -1;
    }
}