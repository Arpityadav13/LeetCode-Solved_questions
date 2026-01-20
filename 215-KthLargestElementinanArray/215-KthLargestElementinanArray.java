// Last updated: 1/20/2026, 10:01:57 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4        for(int num :nums) pq.offer(num);
5        while(k>1){
6            pq.poll();
7            k--;
8        }
9        return pq.poll();
10    }
11}