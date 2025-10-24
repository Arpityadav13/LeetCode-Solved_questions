// Last updated: 10/24/2025, 10:11:17 PM
class Solution {
    public int nextBeautifulNumber(int n) {

        for(int nums = n+1; nums<=1224444;nums++){
            if(balanced(nums)){
                return nums;
            }
        }
        return -1;
        
    }
    public boolean balanced(int num){
        int[] count = new int[10];
        
        while(num>0){
            int digit =num%10;
            count[digit]++;
            num=num/10;

        }
        for(int digit = 0;digit<10;digit++){
            if(count[digit]>0 && count[digit]!=digit){
                return false;
            }        }
            return true;

    }
}