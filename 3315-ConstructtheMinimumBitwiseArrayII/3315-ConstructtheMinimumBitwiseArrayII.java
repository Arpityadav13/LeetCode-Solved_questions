// Last updated: 1/21/2026, 9:42:11 PM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int[] answer = new int[nums.size()];
4        
5        for (int i = 0; i < answer.length; i++) {
6            int k = nums.get(i), n = 1, ans = -1; 
7
8            while ((k & n) != 0) {
9                ans = k - n;
10                n <<= 1;
11            }
12
13            answer[i] = ans;
14        }
15
16        return answer;
17    }
18}