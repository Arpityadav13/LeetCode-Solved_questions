// Last updated: 10/13/2025, 11:30:34 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]>5){
            return false;
        }
        int five=0;
        int ten= 0;
        for(int i = 0 ;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if (bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }

            }else if (ten>0 && five>0){
                five--;
                ten--;}
            else if(five>2){
                five-=3;
            }else{
                return false;
            }
                

            
        }
        return true;

        
    }
}