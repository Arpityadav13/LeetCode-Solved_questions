// Last updated: 1/19/2026, 9:20:53 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(char c : s.toCharArray()){
5            map.put(c,map.getOrDefault(c,0)+1);
6        }
7        PriorityQueue<Character> queue = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
8        queue.addAll(map.keySet());
9        StringBuilder sb =new StringBuilder();
10        while(!queue.isEmpty()){
11            char c = queue.poll();
12            int count = map.get(c);
13            for(int i = 0;i<count;i++){
14                sb.append(c);
15            }
16
17        }
18        return sb.toString();}
19}