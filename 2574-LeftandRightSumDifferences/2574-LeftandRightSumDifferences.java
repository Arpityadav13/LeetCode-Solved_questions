// Last updated: 6/6/2026, 10:23:59 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] surfix = new int[n];
5        int[] prefix = new int[n];
6        prefix[0] =0;
7        surfix[n-1] = 0;
8        for(int i = 1;i<n;i++){
9            prefix[i] = prefix[i-1] + nums[i-1];
10        }
11        for(int j = n-2;j>=0;j--){
12            surfix[j] = nums[j+1] + surfix[j+1];
13        }
14        int[] ans = new int[n];
15        for(int i = 0;i<n;i++){
16            ans[i] = Math.abs(surfix[i]-prefix[i]);
17        }
18        return ans;
19    }
20}