// Last updated: 6/1/2026, 5:07:21 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3       Queue<Integer> q = new PriorityQueue<>((a,b) -> b-a);
4       for(int c : cost){
5         q.add(c);
6       }
7       int ans =0;
8       while(!q.isEmpty()){
9            ans += q.poll();
10            if (!q.isEmpty()) {
11                ans += q.poll();
12            }
13
14            if (!q.isEmpty()) {
15                q.poll();
16            }
17
18       }
19       return ans;
20    }
21}