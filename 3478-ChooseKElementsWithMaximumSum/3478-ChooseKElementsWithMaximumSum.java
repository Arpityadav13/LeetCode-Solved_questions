// Last updated: 1/29/2026, 11:32:52 PM
1class Solution {
2
3    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
4        int n = nums1.length;
5        int[][] arr = new int[n][2];
6        for(int i = 0; i<n; i++){
7            arr[i] = new int[]{nums1[i],nums2[i],i};
8        }    
9        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
10
11        PriorityQueue<Integer> pq = new PriorityQueue<>();
12        HashMap<Integer,Long> map = new HashMap<>();
13        long[] ans = new long[n];
14        long sum = 0;
15        for(int i = 0; i<n; i++){
16            if(map.containsKey(arr[i][0])){
17                ans[arr[i][2]] = map.get(arr[i][0]);
18            }
19            else{
20                ans[arr[i][2]] = sum;
21                map.put(arr[i][0],sum);
22            }
23            if(pq.size() < k){
24                pq.add(arr[i][1]);
25                sum += arr[i][1];
26            }
27            else if(!pq.isEmpty() && pq.peek() < arr[i][1]){
28                sum -= pq.poll();
29                sum += arr[i][1];
30                pq.add(arr[i][1]);
31            }
32        }
33        return ans;
34    }
35}