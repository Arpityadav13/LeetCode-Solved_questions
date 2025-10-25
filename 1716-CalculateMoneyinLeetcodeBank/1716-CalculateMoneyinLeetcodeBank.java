// Last updated: 10/25/2025, 5:49:04 PM
class Solution {
    public int totalMoney(int n) {
         int money=1;
         int sum = 0;
         int i=1;
         int nextmon=2;
         while(i<=n){
            if(i%7==0){
                sum+=money;
                money=nextmon;
                nextmon++;

            }else{
            sum+=money;
            money++;
         }
            i++;}
        return sum;
    }
}