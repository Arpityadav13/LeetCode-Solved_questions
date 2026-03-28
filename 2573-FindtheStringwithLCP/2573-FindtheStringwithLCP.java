// Last updated: 3/28/2026, 11:41:20 PM
1class Solution {
2
3    class DSU {
4        int[] parent;
5        int[] rank;
6
7        DSU(int n) {
8            parent = new int[n];
9            rank = new int[n];
10            for(int i = 0; i < n; i++) parent[i] = i;
11        }
12
13        int findPar(int x) {
14            if(parent[x] == x) return x;
15            return parent[x] = findPar(parent[x]);
16        }
17
18        void unite(int x, int y) {
19            int px = findPar(x);
20            int py = findPar(y);
21
22            if(px == py) return;
23
24            if(rank[px] < rank[py]) parent[px] = py;
25            else if(rank[px] > rank[py]) parent[py] = px;
26            else {
27                parent[px] = py;
28                rank[py]++;
29            }
30        }
31    }
32
33    void compute(String word, int[][] dp) {
34        int n = word.length();
35        for(int i = n - 1; i >= 0; i--) {
36            for(int j = n - 1; j >= 0; j--) {
37                if(word.charAt(i) == word.charAt(j)) {
38                    if(i + 1 < n && j + 1 < n)
39                        dp[i][j] = 1 + dp[i + 1][j + 1];
40                    else
41                        dp[i][j] = 1;
42                } else {
43                    dp[i][j] = 0;
44                }
45            }
46        }
47    }
48
49    public String findTheString(int[][] lcp) {
50        int n = lcp.length;
51        DSU dsu = new DSU(n);
52
53        for(int i = 0; i < n; i++) {
54            if(lcp[i][i] != n - i) return "";
55        }
56
57        for(int i = 0; i < n; i++) {
58            for(int j = i + 1; j < n; j++) {
59                if(lcp[i][j] > 0)
60                    dsu.unite(i, j);
61            }
62        }
63
64        char[] grp = new char[n];
65        char[] word = new char[n];
66        char c = 'a';
67
68        for(int i = 0; i < n; i++) {
69            int p = dsu.findPar(i);
70            if(grp[p] == 0) {
71                if(c > 'z') return "";
72                grp[p] = c++;
73            }
74            word[i] = grp[p];
75        }
76
77        for(int i = 0; i < n; i++) {
78            for(int j = 0; j < n; j++) {
79                if(lcp[i][j] == 0 && word[i] == word[j])
80                    return "";
81            }
82        }
83
84        int[][] dp = new int[n][n];
85        compute(new String(word), dp);
86
87        if(java.util.Arrays.deepEquals(dp, lcp))
88            return new String(word);
89
90        return "";
91    }
92}