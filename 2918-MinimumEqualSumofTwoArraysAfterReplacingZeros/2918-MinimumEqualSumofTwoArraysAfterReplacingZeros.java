// Last updated: 1/11/2026, 2:02:10 PM
1class Solution {
2    public long minSum(int[] nums1, int[] nums2) {
3        long sum_num1 =0;
4        long sum_num2 =0;
5        int count_num1= 0;
6        int count_num2=0;
7
8    for(int i = 0;i<nums1.length;i++){
9        sum_num1+=nums1[i];
10        if(nums1[i]==0){
11            count_num1++;
12        }
13    }     
14    for(int i = 0;i<nums2.length;i++){
15        sum_num2+=nums2[i];
16         if(nums2[i]==0){
17            count_num2++;
18        }
19    } 
20    long minSum1 = sum_num1 + count_num1;
21        long minSum2 = sum_num2 + count_num2;
22
23        // If nums1 has no zero, its sum is fixed
24        if (count_num1 == 0 && minSum2 > sum_num1) return -1;
25
26        // If nums2 has no zero, its sum is fixed
27        if (count_num2 == 0 && minSum1 > sum_num2) return -1;
28
29        return Math.max(minSum1, minSum2);
30    
31        
32    }
33}
34
35
36
37