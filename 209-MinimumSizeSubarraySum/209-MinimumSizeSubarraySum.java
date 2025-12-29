// Last updated: 12/30/2025, 12:06:45 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i = 0, j = 0;
4        int sum = 0;
5        int output = Integer.MAX_VALUE;
6
7        while (j < nums.length) {
8            sum += nums[j];
9            j++;
10
11            while (sum >= target) {
12                output = Math.min(output, j - i); 
13                sum -= nums[i];
14                i++;
15            }
16        }
17
18        return output == Integer.MAX_VALUE ? 0 : output; 
19    }
20}
21