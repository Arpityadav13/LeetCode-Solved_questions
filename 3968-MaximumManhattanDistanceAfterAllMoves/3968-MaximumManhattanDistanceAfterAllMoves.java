// Last updated: 6/21/2026, 2:50:53 PM
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3        int count = 0;
4        char ch = (char)(x + '0');
5
6        for (int i = 0; i < nums.length; i++) {
7            long sum = 0;
8
9            for (int j = i; j < nums.length; j++) {
10                sum += nums[j];
11
12                String s = Long.toString(sum);
13
14                if (s.charAt(0) == ch && s.charAt(s.length() - 1) == ch) {
15                    count++;
16                }
17            }
18        }
19
20        return count;
21    }
22}