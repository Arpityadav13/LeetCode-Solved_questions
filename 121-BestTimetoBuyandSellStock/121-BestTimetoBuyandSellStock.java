// Last updated: 5/8/2026, 5:59:25 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] prefix = new int[nums.length];
4        int[] surfix = new int[nums.length];
5        prefix[0] = 1;
6        surfix[nums.length-1] = 1;
7        for(int i = 1;i<nums.length;i++){
8            prefix[i]=prefix[i-1]*nums[i-1];
9        }
10        for(int j =nums.length-2;j>=0;j--){
11             surfix[j]=surfix[j+1]*nums[j+1];
12        }
13        int[] result = new int[nums.length];
14        for(int i =0;i<nums.length;i++){
15            result[i] = surfix[i]*prefix[i];
16        }
17        return result;
18        
19    }
20}