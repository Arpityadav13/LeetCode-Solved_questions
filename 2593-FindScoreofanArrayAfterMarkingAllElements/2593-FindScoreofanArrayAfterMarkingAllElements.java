// Last updated: 1/29/2026, 2:40:06 PM
1class Solution {
2    public long findScore(int[] nums) {
3
4        int n = nums.length;
5        boolean[] removed = new boolean[n];
6
7        PriorityQueue<int[]> pq = new PriorityQueue<>(
8            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
9        );
10
11        for (int i = 0; i < n; i++)
12            pq.add(new int[]{nums[i], i});
13
14        long sum = 0;
15
16        while (!pq.isEmpty()) {
17            int[] top = pq.poll();
18            int val = top[0];
19            int idx = top[1];
20
21            if (removed[idx]) continue;
22
23            sum += val;
24            removed[idx] = true;
25            if (idx - 1 >= 0) removed[idx - 1] = true;
26            if (idx + 1 < n) removed[idx + 1] = true;
27        }
28
29        return sum;
30    }
31}
32