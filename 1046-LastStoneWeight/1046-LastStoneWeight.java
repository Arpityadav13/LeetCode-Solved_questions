// Last updated: 1/20/2026, 2:15:52 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4        if(stones.length==1){
5            return stones[0];
6        }
7        for(int i= 0 ; i<stones.length;i++){
8            pq.offer(stones[i]);
9        }
10        while(true){
11            if(pq.isEmpty()){
12                return 0;
13            }
14            if(pq.size()==1){
15                return pq.poll();
16            }
17            int var1 = pq.poll();
18            int var2 = pq.poll();
19            if(var1==var2){
20                continue;
21            }
22            else{
23                pq.add(var1-var2);
24            }
25        }
26
27        
28    }
29}   