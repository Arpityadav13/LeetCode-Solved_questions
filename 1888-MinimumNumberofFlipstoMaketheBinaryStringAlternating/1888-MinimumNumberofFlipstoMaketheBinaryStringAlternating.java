// Last updated: 3/8/2026, 12:20:23 AM
1class Solution {
2    public int minFlips(String s) {
3        int n = s.length();
4        int res = n;
5        int[] op = {0, 0};
6
7        for (int i = 0; i < n; i++)
8            op[(s.charAt(i) ^ i) & 1]++;
9
10        for (int i = 0; i < n; i++) {
11            op[(s.charAt(i) ^ i) & 1]--;
12            op[(s.charAt(i) ^ (n + i)) & 1]++;
13            res = Math.min(res, Math.min(op[0], op[1]));
14        }
15
16        return res;
17    }
18}