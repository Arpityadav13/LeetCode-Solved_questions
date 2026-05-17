// Last updated: 5/17/2026, 11:11:10 AM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int tsum = 0;
4        for(int num : nums){
5            tsum += num;
6        }
7         if (Math.abs(target) > tsum) {
8            return 0;
9        }
10
11        if ((tsum + target) % 2 != 0) {
12            return 0;
13        }
14        int s1 = (tsum + target)/2;
15        return countsum(nums,s1,nums.length);
16    }
17    public int countsum(int[] nums,int sum ,int n){
18        int[][] t = new int[n+1][sum+1];
19        for(int i =0;i<=n;i++){
20            t[i][0] = 1;
21        }
22        for(int j =1;j<=sum;j++){
23            t[0][j]=0;
24        }
25        for(int i =1 ;i<=n;i++){
26            for(int j =0;j<=sum;j++){
27                if(nums[i-1]<=j){
28                    t[i][j]=t[i-1][j] + t[i-1][j-nums[i-1]];
29                }else{
30                    t[i][j]=t[i-1][j];
31                }
32            }
33        }
34        return t[n][sum];
35    }
36}