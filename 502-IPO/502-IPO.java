// Last updated: 1/28/2026, 1:39:04 PM
1class Solution {
2    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
3        ArrayList<List<Integer>> l = new ArrayList<>();
4        
5        for(int i = 0; i < profits.length; i++){
6            l.add(Arrays.asList(capital[i], profits[i]));
7        }
8        Collections.sort(l, (a, b) -> a.get(0) - b.get(0));
9            int  i= 0;
10            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
11        while(k-->0){
12            while(i<profits.length &&  l.get(i).get(0)<=w){
13                pq.add(l.get(i).get(1));
14                i++;
15            }            
16            if(pq.isEmpty()){
17                break;
18            }
19            w+=pq.poll();
20        }
21
22
23        
24      
25        
26        return w;
27    }
28}
29