// Last updated: 5/8/2026, 9:57:24 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count =0;
4        int element = nums[0];
5        for(int num : nums){
6            if(count == 0){
7                element =num;
8                count++;
9            }
10            else if(element != num){
11                count--;
12            }else{
13                count++;
14            }
15        }
16        return element;
17    }
18}