// Last updated: 10/22/2025, 3:09:27 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a->a[1]));
        int count = 1;
        int[] prev = points[0];
        for(int i = 1;i<points.length;i++){
            int currS =points[i][0];
            int currE =points[i][1];
            int prevS = prev[0];
            int prevE = prev[1];
            if(currS>prevE){
                prev=points[i];
                count++;
            }else{
                prev[0]= Math.max(prevS,currS);
                prev[1]= Math.min(prevE,currE);
            }
        }
        return count;   
    }
}