// Last updated: 10/13/2025, 11:29:57 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans = 0;
        if(prices[0]+prices[1]<money){
            ans+=money-(prices[0]+prices[1]);
        }else if(prices[0]+prices[1]==money){
            ans=0;
        }else{
            return money;
        }
        return ans;
    }
}