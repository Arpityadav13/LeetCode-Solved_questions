// Last updated: 12/20/2025, 10:25:28 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int output = 0;
4        int rows = strs.length;
5        int cols = strs[0].length();
6
7        for (int i = 0; i < cols; i++) {        // column
8            for (int j = 0; j < rows - 1; j++) { // row
9                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
10                    output++;
11                    break; // delete column only once
12                }
13            }
14        }
15        return output;
16    }
17}
18