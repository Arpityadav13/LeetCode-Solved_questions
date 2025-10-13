// Last updated: 10/13/2025, 11:29:41 PM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int size = prices.length;
        long bpro=0;
        for(int i=0;i<size;i++){
            bpro+=(long)strategy[i]*prices[i];
        }
        long[] prepri=new long[size+1];
        long[] prepro=new long[size+1];
        for(int i =0;i<size;i++){
            prepri[i+1]=prepri[i]+prices[i];
            prepro[i+1]=prepro[i]+(long)strategy[i]*prices[i];
        }
        long maxpro=Long.MIN_VALUE;
        for(int i =0;i+k<=size;i++){
            int mid=i+k/2;
            int end =i+k;
            long oldg = prepro[end]-prepro[i];
            long newg =prepri[end]-prepri[mid];
            long pro =newg-oldg;
            maxpro =Math.max(maxpro,pro);
        }
        return bpro+Math.max(0,maxpro);
    }
}