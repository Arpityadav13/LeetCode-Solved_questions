// Last updated: 5/31/2026, 11:18:24 PM
1class Solution {
2    int[] t  = new int[101];
3    public int rob(int[] nums) {
4        Arrays.fill(t,-1);
5        return solve(nums,nums.length-1);
6    }
7    public int solve(int[] nums , int n ){
8        if(n<0){
9            return 0;
10        }
11        if(t[n] != -1){
12            return t[n];
13        }
14        int left = nums[n] + solve(nums,n-2);
15        int right  = solve(nums,n-1);
16        return t[n] = Math.max(right,left);
17
18    }
19}