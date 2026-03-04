// Last updated: 3/4/2026, 1:24:25 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3         Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
4        
5        List<int[]> l = new ArrayList<>();
6        
7        int[] prev = intervals[0];
8       for(int i = 1;i<intervals.length;i++){
9            
10            int currS = intervals[i][0];
11            int currE = intervals[i][1];
12            if(prev[1]<currS){
13                l.add(prev);
14                prev=intervals[i];
15            }else{
16                prev[0]=Math.min(prev[0],currS);
17                prev[1]=Math.max(prev[1],currE);
18
19            }
20            
21        }
22        l.add(prev);
23        return l.toArray(new int[l.size()][]);
24    }
25}