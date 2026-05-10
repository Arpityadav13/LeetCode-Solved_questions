// Last updated: 5/10/2026, 1:57:28 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n= nums.length;
4        int[] ans = new int[n*2];
5        for(int i =0;i<n;i++){
6            ans[i]=nums[i];
7        }
8        for(int i =n-1;i>=0;i--){
9            ans[(n-1)+(n-i)]=nums[i];
10        }
11        return ans;
12    }
13}