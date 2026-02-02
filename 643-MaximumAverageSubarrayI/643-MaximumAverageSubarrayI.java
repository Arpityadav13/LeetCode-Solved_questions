// Last updated: 2/2/2026, 10:59:16 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int i = 0,j=0 ;
4        double output = Integer.MIN_VALUE;
5        int sum = 0;
6        while(j<nums.length){
7            sum+=nums[j];
8            if((j-i+1)==k){
9                output =Math.max(output,sum*1.0/k);
10                sum-=nums[i];
11                i++;
12            }
13            j++;
14        }
15        return output;
16    }
17}