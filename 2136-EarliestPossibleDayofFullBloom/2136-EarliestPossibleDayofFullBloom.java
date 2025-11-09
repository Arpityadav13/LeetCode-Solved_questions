// Last updated: 11/9/2025, 7:58:53 PM
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int[][] pair = new int[plantTime.length][2];
        
        for (int i = 0; i < plantTime.length; i++) {
            pair[i][0] = plantTime[i];
            pair[i][1] = growTime[i];
        }
        
        Arrays.sort(pair, (a, b) -> Integer.compare(b[1], a[1]));
        
        int maxbloomtime = 0;
        int prev = 0;
        for(int i = 0;i<plantTime.length;i++){
            int currplanttime=pair[i][0];
            int currgrowtime=pair[i][1];
            int sum =prev+currplanttime+currgrowtime;
            prev = prev+currplanttime;
            maxbloomtime=Math.max(maxbloomtime,sum);
        }
        return maxbloomtime;
    }
}
