// Last updated: 3/9/2026, 11:32:29 AM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0;
4        int high = 0;
5        for(int num : nums ){
6            low = Math.max(low,num);
7            high+=num;
8
9        }
10        while(low<high){
11            int mid = low + (high-low)/2;
12            if(cansplit(nums,k,mid)){
13                high =mid;
14            }else{
15                low = mid+1;
16            }
17        }
18        return low ;
19    }
20    public boolean cansplit(int[] nums, int k,int maxsum){
21        int sum = 0;
22        int subarray= 1;
23        for(int num : nums){
24            if(sum+num>maxsum){
25                subarray++;
26                sum=num;
27                if(subarray>k){
28                    return false;
29                }
30            }else{
31                sum+=num;
32            }
33        }
34        return true;
35
36    }
37
38}