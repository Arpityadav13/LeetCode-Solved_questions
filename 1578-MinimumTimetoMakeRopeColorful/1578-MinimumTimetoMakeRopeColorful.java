// Last updated: 10/28/2025, 5:58:24 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time =0;
        int maxtime = neededTime[0];
        char prev = colors.charAt(0);
        for(int i =1; i<colors.length();i++){
            if(colors.charAt(i)== colors.charAt(i-1)){
                 time+= Math.min(maxtime,neededTime[i]);
                maxtime = Math.max(maxtime, neededTime[i]);

            }else{
                maxtime = neededTime[i];
            }
           
            
        }
        return time;
    }
}