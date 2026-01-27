// Last updated: 1/27/2026, 11:41:55 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        PriorityQueue<Long> pq = new PriorityQueue<>();
4        for (int num : nums) pq.add((long) num);
5
6        int ops = 0;
7
8        while (pq.peek() < k) {
9            if (pq.size() < 2) return -1;
10            long a = pq.poll();
11            long b = pq.poll();
12            pq.add(a * 2 + b);
13            ops++;
14        }
15
16        return ops;
17    }
18}
19