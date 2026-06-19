// Last updated: 6/19/2026, 10:56:37 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] prefix = new int[gain.length+1];
4        prefix[0] = 0;
5        for(int i =1;i<gain.length+1;i++){
6            prefix[i] =  prefix[i-1] + gain[i-1];
7        }
8        int max = 0;
9        for(int i = 0;i<prefix.length;i++){
10            max = Math.max(max,prefix[i]);
11        }
12        return max;
13    }
14}