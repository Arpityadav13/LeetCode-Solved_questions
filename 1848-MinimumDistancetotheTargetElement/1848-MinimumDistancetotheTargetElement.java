// Last updated: 4/14/2026, 12:12:00 AM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int minDist = Integer.MAX_VALUE;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] == target) {
7                minDist = Math.min(minDist, Math.abs(i - start));
8            }
9        }
10
11        return minDist;
12    }
13}