// Last updated: 12/19/2025, 12:15:19 AM
1class Solution {
2    public long maxProfit(int[] prices, int[] strategy, int k) {
3        int size = prices.length;
4        long bpro=0;
5        for(int i=0;i<size;i++){
6            bpro+=(long)strategy[i]*prices[i];
7        }
8        long[] prepri=new long[size+1];
9        long[] prepro=new long[size+1];
10        for(int i =0;i<size;i++){
11            prepri[i+1]=prepri[i]+prices[i];
12            prepro[i+1]=prepro[i]+(long)strategy[i]*prices[i];
13        }
14        long maxpro=Long.MIN_VALUE;
15        for(int i =0;i+k<=size;i++){
16            int mid=i+k/2;
17            int end =i+k;
18            long oldg = prepro[end]-prepro[i];
19            long newg =prepri[end]-prepri[mid];
20            long pro =newg-oldg;
21            maxpro =Math.max(maxpro,pro);
22        }
23        return bpro+Math.max(0,maxpro);
24    }
25}