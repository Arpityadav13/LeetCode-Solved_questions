// Last updated: 12/15/2025, 8:24:56 PM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        int n =prices.length;
4        long output =0;
5        
6        int i =prices.length-1;
7        while(i>=0){
8            long j= 1;
9            while(i>0 && prices[i-1]==prices[i]+1){
10                j++;
11                i--;
12
13
14            }
15                output+=(j*(j+1))/2;
16                i--;
17                
18        }
19        return output;
20        
21    }
22}