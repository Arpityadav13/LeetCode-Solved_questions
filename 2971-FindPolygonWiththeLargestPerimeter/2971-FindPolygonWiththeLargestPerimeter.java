// Last updated: 12/27/2025, 10:39:34 PM
1
2
3class Solution {
4    public long largestPerimeter(int[] nums) {
5        long sum = 0;
6        Arrays.sort(nums);
7        for (int num : nums) {
8            sum += num;
9        }
10        int n = nums.length;
11        for (int i = n - 1; i >= 2; i--) {
12            sum -= nums[i];
13            if (sum > nums[i]) {
14                return sum + nums[i];
15            }
16        }
17        return -1;
18    }
19}
20