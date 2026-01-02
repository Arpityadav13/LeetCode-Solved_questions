// Last updated: 1/2/2026, 8:20:46 PM
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long maxreach = 0;
4        int output =0;
5        int i = 0;
6       while(maxreach<n){
7        if(i<nums.length && maxreach+1>=nums[i]){
8            maxreach+=nums[i];
9            i++;
10        }else{
11            maxreach+=maxreach+1;
12            output++;
13        }
14
15       }
16        return output;
17    }
18}