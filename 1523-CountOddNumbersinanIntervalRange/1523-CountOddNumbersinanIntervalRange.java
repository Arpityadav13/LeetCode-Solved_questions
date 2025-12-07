// Last updated: 12/7/2025, 10:42:52 PM
1class Solution {
2    public int countOdds(int low, int high) {
3        if(high==0 ) return 0;
4        int output =0;
5        while(low<=high){
6            if(low%2!=0){
7                output++;
8                low++;
9            }
10            low++;
11        }
12        return output;
13    }
14}