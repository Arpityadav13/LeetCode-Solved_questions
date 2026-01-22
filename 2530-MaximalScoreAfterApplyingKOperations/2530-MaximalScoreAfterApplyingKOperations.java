// Last updated: 1/22/2026, 11:54:20 PM
1class Solution {
2    public long maxKelements(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4        for(int num : nums) pq.add(num);
5        long score = 0;
6        while(k-->0){
7            long var = pq.poll();
8            score+=var;
9            pq.add((int)Math.ceil(var/3.0));
10        }
11return score;
12    }
13}