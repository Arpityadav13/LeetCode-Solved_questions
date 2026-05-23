// Last updated: 5/23/2026, 9:03:53 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4        int n = nums.length;
5
6        for(int i = 0; i < n; i++) {
7            if(nums[i] > nums[(i+1)%n]) {
8                count++;
9            }
10        }
11
12        return count <= 1;
13    }
14}