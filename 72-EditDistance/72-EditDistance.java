// Last updated: 5/29/2026, 10:08:30 PM
1class Solution {
2
3    public int minDistance(String word1, String word2) {
4    int[][] t = new int[501][501];
5    int m = word1.length();
6    int n = word2.length();
7     for (int i = 0; i <= m; i++) {
8            t[i][0] = i;
9        }
10
11        for (int j = 0; j <= n; j++) {
12            t[0][j] = j;
13        }
14
15        for (int i = 1; i <= m; i++) {
16            for (int j = 1; j <= n; j++) {
17
18                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
19                    t[i][j] = t[i - 1][j - 1];
20                } else {
21                    t[i][j] = 1 + Math.min(
22                            t[i - 1][j - 1], // replace
23                            Math.min(
24                                    t[i - 1][j], // delete
25                                    t[i][j - 1]  // insert
26                            )
27                    );
28                }
29            }
30        }
31
32        return t[m][n];
33       
34    }
35}