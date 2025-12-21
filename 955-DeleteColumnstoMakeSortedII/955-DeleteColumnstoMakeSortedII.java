// Last updated: 12/21/2025, 11:54:42 PM
1class Solution {
2    public int minDeletionSize(String[] s) {
3        int r = s.length, c = s[0].length();
4        int count = 0;
5
6        boolean[] already_sorted = new boolean[r];
7
8        for (int col = 0; col < c; col++) {
9            boolean need_to_delete = false;
10
11            for (int row = 1; row < r; row++) {
12                if (!already_sorted[row - 1]) {
13                    if (s[row].charAt(col) < s[row - 1].charAt(col)) {
14                        need_to_delete = true;
15                        break;
16                    }
17                }
18            }
19
20            if (need_to_delete) {
21                count++;
22            } else {
23                for (int row = 1; row < r; row++) {
24                    if (!already_sorted[row - 1]) {
25                        if (s[row].charAt(col) > s[row - 1].charAt(col)) {
26                            already_sorted[row - 1] = true;  
27                        }
28                    }
29                }
30            }
31        }
32
33        return count;
34    }
35}