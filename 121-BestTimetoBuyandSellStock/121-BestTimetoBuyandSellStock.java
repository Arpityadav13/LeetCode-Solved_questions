// Last updated: 5/8/2026, 5:37:58 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
4        List<int[]> list = new ArrayList<>();
5        int[] prev = new int[2];
6        prev[0]=intervals[0][0];
7        prev[1]=intervals[0][1];
8        for(int i =1;i<intervals.length;i++){
9            int curr0 = intervals[i][0];
10            int curr1 = intervals[i][1];
11            if(prev[1]>=curr0){
12                prev[0] =Math.min(prev[0],curr0);
13                prev[1] =Math.max(prev[1],curr1);
14            }
15            else{
16                list.add(prev);
17                prev = intervals[i];
18            }
19
20        }
21        list.add(prev);
22        return list.toArray(new int[list.size()][]);
23    }}
24