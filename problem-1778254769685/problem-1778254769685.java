// Last updated: 5/8/2026, 9:09:29 PM
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n=nums.length;
4        int[] result = new int[n];
5        boolean odd = false;
6        boolean even = false;
7        for(int i = 0;i<n;i++){
8            int count = 0;
9            if(nums[i]%2==0){
10                even = false;
11                odd =true;
12            }else{
13                even = true;
14                odd =false;
15            }
16            for(int j=i+1;j<n;j++){
17                if(even && nums[j]%2==0){
18                    count++;
19                    
20                }
21                if(odd && nums[j]%2!=0){
22                    count++;
23                    
24                }
25            }
26            result[i] =count;
27            
28        }
29        return result;
30    }
31}