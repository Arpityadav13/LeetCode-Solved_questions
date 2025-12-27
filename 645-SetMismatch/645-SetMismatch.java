// Last updated: 12/27/2025, 10:50:23 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        HashSet<Integer> set =new HashSet<>();
4        int[] l =new int[2];
5        for(int i = 0;i<nums.length;i++){
6            if(set.contains(nums[i])){
7                l[0]=nums[i];
8            }
9            set.add(nums[i]);
10        }for(int i = 1;i<=nums.length;i++){
11                        if (!set.contains(i)) {
12                l[1] = i;
13                break;
14            }
15
16        }
17
18        return l;
19    }
20}