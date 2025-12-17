// Last updated: 12/17/2025, 7:50:25 PM
1class Data{
2    long profit=0, buy=0, sell=0;
3    Data(long profit, long buy, long sell){
4        this.profit=profit;
5        this.buy=buy;
6        this.sell=sell;
7    }
8}
9class Solution {
10    static public long maximumProfit(int[] prices, int k) {
11        final int x0=prices[0], n=prices.length;
12        Data [] dp=new Data[k+1];
13        for (int t=0; t<=k; t++)
14            dp[t]=new Data(0, -x0, x0);
15        for(int i=1; i<n; i++){
16            final int x=prices[i];
17            for(int t=k; t>0; t--){
18                Data cur=dp[t];
19                long prevP=dp[t-1].profit;
20                cur.profit=Math.max(cur.profit, Math.max(cur.buy+x, cur.sell-x));
21                cur.buy=Math.max(cur.buy,  prevP-x);
22                cur.sell=Math.max(cur.sell, prevP+x);
23            }
24        }
25        return dp[k].profit;
26    }
27}