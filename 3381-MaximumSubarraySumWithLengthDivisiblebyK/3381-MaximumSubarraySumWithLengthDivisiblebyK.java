// Last updated: 11/27/2025, 11:32:17 PM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        final long n=nums.length, INF=Long.MAX_VALUE/2;
4        long [] minS=new long[k];
5        for(int i=0; i<k-1; i++) minS[i]=INF;
6        minS[k-1]=0;
7        long prefix=0, ans=-INF;
8        for(int i=0; i<n; i++){
9            prefix+=nums[i];
10            int ik=i%k;
11            ans=Math.max(ans, prefix-minS[ik]);
12            minS[ik]=Math.min(prefix, minS[ik]);  
13        }
14        return ans;
15    }
16}