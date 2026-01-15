// Last updated: 1/15/2026, 3:12:12 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        ArrayList<Integer> l = new ArrayList<>();
4
5        int count = 0;
6        
7        for(int i =0;i<nums.length;i++){
8            if(nums[i]==0){
9                l.add(count);
10                count = 0;
11                continue;
12            }
13            count++;
14        }
15        l.add(count);
16        int output= 0;
17        if(l.size()==1){
18            return l.get(0)-1;
19        }
20        for(int i =0;i<l.size()-1;i++){
21            output= Math.max(output,l.get(i)+l.get(i+1));
22        }
23        return output;
24    }
25}