// Last updated: 5/29/2026, 10:06:46 PM
1class Solution {
2    int[][] t = new int[501][501];
3
4    public int minDistance(String word1, String word2) {
5        return editDistance(word1, word2, word1.length(), word2.length());
6    }
7
8    public int editDistance(String word1, String word2, int m, int n) {
9
10        for (int i = 0; i <= m; i++) {
11            t[i][0] = i;
12        }
13
14        for (int j = 0; j <= n; j++) {
15            t[0][j] = j;
16        }
17
18        for (int i = 1; i <= m; i++) {
19            for (int j = 1; j <= n; j++) {
20
21                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
22                    t[i][j] = t[i - 1][j - 1];
23                } else {
24                    t[i][j] = 1 + Math.min(
25                            t[i - 1][j - 1], // replace
26                            Math.min(
27                                    t[i - 1][j], // delete
28                                    t[i][j - 1]  // insert
29                            )
30                    );
31                }
32            }
33        }
34
35        return t[m][n];
36    }
37}