// Last updated: 6/23/2026, 1:56:16 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        int n = nums.length;
5        if(n==1){
6            return nums[0];
7        }
8        int max = 0;
9        for(int i =0 ;i<nums.length;i++){
10            int pro = 1;
11            for(int j = i ;j<n;j++){
12                pro *=nums[j];
13                max = Math.max(pro,max);
14            }
15
16        }
17        return max;
18    }
19}