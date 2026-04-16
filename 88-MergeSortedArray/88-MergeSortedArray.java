// Last updated: 4/16/2026, 2:30:37 PM
1import java.util.Arrays;
2
3class Solution {
4    public void merge(int[] nums1, int m, int[] nums2, int n) {
5        int[] merged = new int[m + n];
6        for (int i = 0; i < m; i++) {
7            merged[i] = nums1[i];
8        }
9
10        for (int i = 0; i < n; i++) {
11            merged[m + i] = nums2[i];
12        }
13        Arrays.sort(merged);
14        for (int i = 0; i < merged.length; i++) {
15            nums1[i] = merged[i];
16        }
17    }
18}
19