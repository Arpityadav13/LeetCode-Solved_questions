// Last updated: 1/21/2026, 6:04:54 PM
1class Solution {
2    public long minMoves(int[] balance) {
3        int culprit_idx = -1;
4        long sum = 0;
5        int n = balance.length;
6        for(int i =0;i<balance.length;i++){
7            sum+=balance[i];
8            if(balance[i]<0){
9                culprit_idx = i;
10            }
11        }
12        if(culprit_idx==-1){
13            return 0;
14        }
15        if(sum<0){
16            return -1;
17        }
18        long moves = 0;
19        int dist = 1;
20        while(balance[culprit_idx]<0){
21            int left = (culprit_idx+dist)%n;
22            int right = (culprit_idx-dist+n)%n;
23            long a = balance[left]+balance[right];
24            if(left==right){
25                a-=balance[right];
26            }
27            long needed  = Math.abs(balance[culprit_idx]);
28            long taken = Math.min(needed,a);
29            balance[culprit_idx]+=taken;
30            moves += taken *dist;
31            dist++;
32
33            
34        }
35        
36      return moves;  
37    }
38}