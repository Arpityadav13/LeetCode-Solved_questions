// Last updated: 10/29/2025, 9:18:23 PM
class Solution {
    public int smallestNumber(int n) {
        int num = 2;
        while(num-1<n){
            num*=2;
        }
        return num-1;


    }
}