// Last updated: 2/3/2026, 1:52:31 PM
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int lengthofnums = nums.length;
4        for(int x= 1; x<lengthofnums-2; x++){
5            
6            boolean increasing = true;
7            for(int i= 0 ; i<x;i++){
8            if(nums[i]>= nums[i+1]){
9                increasing = false;
10                break;
11            }
12            
13        }
14        if(!increasing) continue;
15        for(int y= x+1; y<lengthofnums-1; y++){
16            boolean decreasing = true;
17            for(int j = x;j<y;j++){
18            if(nums[j]<= nums[j+1]){
19                decreasing = false;
20                break;
21            }
22            
23        }
24        if(!decreasing) continue;
25        boolean increasing2 = true;
26        for(int k= y; k<lengthofnums-1; k++){
27            
28            if(nums[k]>= nums[k+1]){
29                increasing2 = false;
30                break;
31            }
32            
33        }
34        if(increasing2) return true;}
35        }
36
37    return false;
38        
39    }
40    
41}