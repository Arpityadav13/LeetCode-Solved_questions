// Last updated: 1/21/2026, 11:25:59 PM
1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3
4        List<List<Integer>> result = new ArrayList<>();
5        if(nums1.length == 0 || nums2.length == 0 || k == 0) return result;
6
7        // pq: {sum, i, j}  (sum used for comparison)
8        PriorityQueue<int[]> pq =
9            new PriorityQueue<>((a, b) -> a[0] - b[0]);
10
11        // push initial pairs: nums1[i] + nums2[0]
12        for(int i = 0; i < Math.min(nums1.length, k); i++) {
13            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
14        }
15
16        // extract k pairs
17        while(k-- > 0 && !pq.isEmpty()) {
18            int[] top = pq.poll();
19            int sum = top[0];
20            int i = top[1];
21            int j = top[2];
22
23            result.add(Arrays.asList(nums1[i], nums2[j]));
24
25            // next pair: (i, j+1)
26            if(j + 1 < nums2.length) {
27                pq.offer(new int[]{nums1[i] + nums2[j+1], i, j+1});
28            }
29        }
30
31        return result;
32    }
33}
34