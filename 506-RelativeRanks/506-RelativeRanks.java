// Last updated: 1/19/2026, 7:13:54 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        
4        int n = score.length;
5        
6        PriorityQueue<Pair<Integer, Integer>> maxheap = new PriorityQueue<>((p1, p2) -> (p2.getValue() - p1.getValue()));
7        
8        for (int i = 0 ; i < n ; i++) {
9            maxheap.add(new Pair(i, score[i]));
10        }
11        
12        String[] ans = new String[n];
13        
14        int place = 1;
15        
16        while (!maxheap.isEmpty()) {
17            Pair<Integer, Integer> top = maxheap.poll();
18            
19            int curIndex = top.getKey();
20            
21            if (place == 1) {
22                ans[curIndex] = "Gold Medal";
23            } else if (place == 2) {
24                ans[curIndex] = "Silver Medal";
25            } else if (place == 3) {
26                ans[curIndex] = "Bronze Medal";
27            } else {
28                ans[curIndex] = String.valueOf(place);
29            }
30            place++;
31             
32        }
33        
34        return ans;
35    }
36}