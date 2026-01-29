// Last updated: 1/29/2026, 10:07:12 PM
1class Solution {
2    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
3        int[][] dis = new int[26][26];
4        for (int i = 0; i < 26; i++) {
5            Arrays.fill(dis[i], Integer.MAX_VALUE);
6            dis[i][i] = 0;
7        }
8        
9        for (int i = 0; i < cost.length; i++) {
10            int u = original[i] - 'a';
11            int v = changed[i] - 'a';
12            dis[u][v] = Math.min(dis[u][v], cost[i]);
13        }
14
15        for (int k = 0; k < 26; k++) {
16            for (int i = 0; i < 26; i++) {
17                if (dis[i][k] == Integer.MAX_VALUE) continue;
18                for (int j = 0; j < 26; j++) {
19                    if (dis[k][j] == Integer.MAX_VALUE) continue;
20                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
21                }
22            }
23        }
24
25        long totalCost = 0L;
26        for (int i = 0; i < source.length(); i++) {
27            int c1 = source.charAt(i) - 'a';
28            int c2 = target.charAt(i) - 'a';
29            if (dis[c1][c2] == Integer.MAX_VALUE) return -1L;
30            totalCost += (long) dis[c1][c2];
31        }
32        return totalCost;
33    }
34}
35