// Last updated: 11/10/2025, 4:04:42 PM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int output =0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                output++;
            }
        }
        return output;
    }
}