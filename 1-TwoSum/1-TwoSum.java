// Last updated: 6/29/2026, 9:08:13 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int list[] = new int[2];
4        int i =0;
5        while(i<nums.length){
6            for(int n =i+1;n<nums.length;n++){
7                if(nums[i]+nums[n]==target){
8                    list[0]=i;
9                    list[1]=n;
10                }
11            }
12            i++;
13        }
14        return list;
15    }
16}