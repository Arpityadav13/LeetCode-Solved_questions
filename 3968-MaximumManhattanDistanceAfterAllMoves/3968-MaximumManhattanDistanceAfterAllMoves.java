// Last updated: 6/21/2026, 2:30:09 PM
1class Solution {
2    public int maxDistance(String moves) {
3        int D = 0;
4        int U = 0;
5        int L = 0;
6        int R = 0;
7        int underscore = 0;
8        for(int i  = 0;i<moves.length();i++){
9            char c = moves.charAt(i);
10            if(c == 'D'  ){
11                D++;
12            }else if(c == 'U'){
13                 U++;
14            }else if(c == 'L'){
15                L++;
16            }else if(c == 'R'){
17                R++;
18            }else{
19                underscore++;
20            }
21        }
22        int vertical = Math.abs(D-U);
23        int horizontal = Math.abs(L-R);
24        return vertical + horizontal + underscore;
25    }
26}