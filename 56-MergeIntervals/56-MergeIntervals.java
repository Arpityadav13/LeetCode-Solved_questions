// Last updated: 10/23/2025, 6:06:48 PM
class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        
        List<int[]> l = new ArrayList<>();
        
        int[] prev = intervals[0];
       for(int i = 1;i<intervals.length;i++){
            
            int currS = intervals[i][0];
            int currE = intervals[i][1];
            if(prev[1]<currS){
                l.add(prev);
                prev=intervals[i];
            }else{
                prev[0]=Math.min(prev[0],currS);
                prev[1]=Math.max(prev[1],currE);

            }
            
        }
        l.add(prev);
        return l.toArray(new int[l.size()][]);
    }
}