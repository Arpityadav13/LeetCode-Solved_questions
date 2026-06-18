// Last updated: 6/18/2026, 3:33:34 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Arrays.sort(nums);
4
5        List<Integer> ans = new ArrayList<>();
6        int n = nums.length;
7
8        int count = 1;
9
10        for (int i = 1; i < n; i++) {
11            if (nums[i] == nums[i - 1]) {
12                count++;
13            } else {
14                if (count > n / 3) {
15                    ans.add(nums[i - 1]);
16                }
17                count = 1;
18            }
19        }
20
21        // Check last element's frequency
22        if (count > n / 3) {
23            ans.add(nums[n - 1]);
24        }
25
26        return ans;
27    }
28}