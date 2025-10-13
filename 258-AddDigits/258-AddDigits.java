// Last updated: 10/13/2025, 11:31:19 PM
class Solution {
    public int addDigits(int num) {
    if(num<10){
        return num;
    }
    while(true){
    int sum = 0;

        
        while(num!=0){
            sum+=num%10;
            num=num/10;

        }
        if(sum<10){
            return sum;
        }
    num=sum;
    }
        
    }
}