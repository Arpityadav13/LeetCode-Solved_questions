// Last updated: 5/8/2026, 3:43:24 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buystock =prices[0];
4        int profit =0;
5        for(int i= 1;i<prices.length;i++){
6            if(prices[i]<buystock){
7                buystock = prices[i];
8            }else{
9                profit = Math.max(profit,prices[i]-buystock);
10            }
11        }
12return profit;
13    }
14}