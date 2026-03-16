// Last updated: 3/16/2026, 11:54:02 PM
1class Solution {
2    public int[] getBiggestThree(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        int[][] diag1 = new int[m + 1][n + 1];
6        int[][] diag2 = new int[m + 1][n + 2];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j];
11                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j];
12            }
13        }
14
15        TreeSet<Integer> top3 = new TreeSet<>();
16
17        for (int i = 0; i < m; i++) {
18            for (int j = 0; j < n; j++) {
19                top3.add(grid[i][j]);
20                if (top3.size() > 3) {
21                    top3.pollFirst(); // remove smallest
22                }
23
24                for (int k = 1; i - k >= 0 && i + k < m && j - k >= 0 && j + k < n; k++) {
25                    int topR = i - k, topC = j;
26                    int rightR = i, rightC = j + k;
27                    int bottomR = i + k, bottomC = j;
28                    int leftR = i, leftC = j - k;
29
30                    long border = 0;
31
32                    // top -> right   (\)
33                    border += diag1[rightR + 1][rightC + 1] - diag1[topR][topC];
34
35                    // right -> bottom (/)
36                    border += diag2[bottomR + 1][bottomC] - diag2[rightR][rightC + 1];
37
38                    // left -> bottom  (\)
39                    border += diag1[bottomR + 1][bottomC + 1] - diag1[leftR][leftC];
40
41                    // top -> left     (/)
42                    border += diag2[leftR + 1][leftC] - diag2[topR][topC + 1];
43
44                    // corners counted twice
45                    border -= grid[topR][topC];
46                    border -= grid[rightR][rightC];
47                    border -= grid[bottomR][bottomC];
48                    border -= grid[leftR][leftC];
49
50                    top3.add((int) border);
51                    if (top3.size() > 3) {
52                        top3.pollFirst(); // remove smallest
53                    }
54                }
55            }
56        }
57
58        int[] ans = new int[top3.size()];
59        int idx = 0;
60        for (int val : top3.descendingSet()) {
61            ans[idx++] = val;
62        }
63        return ans;
64    }
65}