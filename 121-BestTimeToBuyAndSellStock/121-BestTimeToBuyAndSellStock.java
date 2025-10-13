// Last updated: 10/13/2025, 11:31:51 PM
class Solution {
    public int maxProfit(int[] prices) {
        int Buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<prices.length;i++){
            if(Buyprices<prices[i]){
                int profit = prices[i]-Buyprices;
                maxprofit = Math.max(maxprofit,profit);

            }else{
                Buyprices=prices[i];
            }
        }
        return maxprofit;
    }
}