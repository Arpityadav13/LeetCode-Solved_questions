// Last updated: 2/22/2026, 11:24:47 PM
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