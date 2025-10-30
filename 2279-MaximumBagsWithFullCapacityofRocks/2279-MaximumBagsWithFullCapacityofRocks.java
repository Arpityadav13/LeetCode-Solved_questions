// Last updated: 10/30/2025, 9:36:40 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] space = new int[rocks.length];
        int output =0;
        for(int i = 0;i<rocks.length;i++){
            space[i]=Math.abs(rocks[i]-capacity[i]);
        }
        Arrays.sort(space);
        for(int i=0;i<space.length;i++){
            if(space[i]==0){
                output++;
            }
             else if(space[i]<=additionalRocks){
                output++;
                additionalRocks-=space[i];
            }else{
                break;
            }
        }
        return output;
    }
}