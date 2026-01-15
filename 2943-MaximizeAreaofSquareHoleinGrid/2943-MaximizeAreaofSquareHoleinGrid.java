// Last updated: 1/15/2026, 10:53:57 PM
1class Solution {
2    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
3        int maxConsecutiveHBars = 1;
4        int maxConsecutiveVBars = 1;
5
6        Arrays.sort(hBars);
7        Arrays.sort(vBars);
8
9        int hLength = hBars.length;
10        int vLength = vBars.length;
11
12        int tempH = 1;
13        int tempV = 1;
14
15        for (int i = 1; i < Math.max(hLength, vLength); i++) {
16
17            if (i < hLength && hBars[i] - hBars[i - 1] == 1) {
18                tempH++;
19            } else if (i < hLength) {
20                maxConsecutiveHBars = Math.max(maxConsecutiveHBars, tempH);
21                tempH = 1;
22            }
23
24            if (i < vLength && vBars[i] - vBars[i - 1] == 1) {
25                tempV++;
26            } else if (i < vLength) {
27                maxConsecutiveVBars = Math.max(maxConsecutiveVBars, tempV);
28                tempV = 1;
29            }
30        }
31
32        maxConsecutiveHBars = Math.max(maxConsecutiveHBars, tempH);
33        maxConsecutiveVBars = Math.max(maxConsecutiveVBars, tempV);
34
35        int squareLen = Math.min(maxConsecutiveHBars, maxConsecutiveVBars) + 1;
36
37        return squareLen * squareLen;
38    }
39}