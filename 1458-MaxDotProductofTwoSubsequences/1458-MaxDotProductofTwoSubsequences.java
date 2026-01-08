// Last updated: 1/8/2026, 11:16:11 PM
1import java.util.*;
2
3class Solution {
4    int[] nums1, nums2;
5    int[][] memo;
6    int n, m;
7    final int NEG_INF = (int) -1e9;
8
9    int dp(int i, int j) {
10        if (i == n || j == m)
11            return NEG_INF;
12
13        if (memo[i][j] != Integer.MIN_VALUE)
14            return memo[i][j];
15
16        int take = nums1[i] * nums2[j];
17
18        int res = Math.max(
19            Math.max(
20                take + dp(i + 1, j + 1), // take both and continue
21                take                    // take and end here
22            ),
23            Math.max(
24                dp(i + 1, j),           // skip nums1[i]
25                dp(i, j + 1)            // skip nums2[j]
26            )
27        );
28
29        return memo[i][j] = res;
30    }
31
32    public int maxDotProduct(int[] a, int[] b) {
33        nums1 = a;
34        nums2 = b;
35        n = nums1.length;
36        m = nums2.length;
37
38        memo = new int[n][m];
39        for (int i = 0; i < n; i++)
40            Arrays.fill(memo[i], Integer.MIN_VALUE);
41
42        return dp(0, 0);
43    }
44}