// Last updated: 1/20/2026, 11:25:04 PM
1class Solution {
2    public long totalCost(int[] costs, int k, int candidates) {
3        int n = costs.length;
4        int left = 0;
5        int right = n - 1;
6
7        PriorityQueue<Integer> leftPQ = new PriorityQueue<>();
8        PriorityQueue<Integer> rightPQ = new PriorityQueue<>();
9
10        // load left side
11        for (int i = 0; i < candidates && left <= right; i++) {
12            leftPQ.offer(costs[left++]);
13        }
14
15        // load right side
16        for (int i = 0; i < candidates && left <= right; i++) {
17            rightPQ.offer(costs[right--]);
18        }
19
20        long total = 0;
21
22        while (k-- > 0) {
23            int leftMin = leftPQ.isEmpty() ? Integer.MAX_VALUE : leftPQ.peek();
24            int rightMin = rightPQ.isEmpty() ? Integer.MAX_VALUE : rightPQ.peek();
25
26            if (leftMin <= rightMin) {
27                total += leftPQ.poll();
28                if (left <= right) {
29                    leftPQ.offer(costs[left++]);
30                }
31            } else {
32                total += rightPQ.poll();
33                if (left <= right) {
34                    rightPQ.offer(costs[right--]);
35                }
36            }
37        }
38
39        return total;
40    }
41}
42