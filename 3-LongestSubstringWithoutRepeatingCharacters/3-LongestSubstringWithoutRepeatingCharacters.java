// Last updated: 10/31/2025, 2:25:31 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int output =0 ;
        for(int i = 0;i<costs.length;i++){
            if(costs[i]<=coins){
                output++;
                coins-=costs[i];
            }else{
                 break;
            }
        }
        return output;
    }
}