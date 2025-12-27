// Last updated: 12/27/2025, 10:49:01 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int[] output = new int[nums.length];
4        for(int i = 0;i<nums.length;i++){
5            for(int j = 0;j<nums.length;j++){
6                if(j==i){
7                    continue;
8                }
9                if(nums[j]<nums[i]){
10                    output[i]++;
11                }
12
13            }
14        }
15        return output;
16    }
17}