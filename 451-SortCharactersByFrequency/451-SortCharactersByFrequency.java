// Last updated: 1/19/2026, 9:56:14 PM
1class Solution {
2    public int minStoneSum(int[] piles, int k) {
3        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->b-a);
4        for(int pile : piles) pq.offer(pile);
5        while(k>0){
6            int var = pq.poll();
7            pq.add(var-(int)Math.floor(var/2));
8            k--;
9        }
10        int sum =0;
11        while(!pq.isEmpty()){
12            sum+=pq.poll();
13        }
14        
15        return sum;
16    }
17}