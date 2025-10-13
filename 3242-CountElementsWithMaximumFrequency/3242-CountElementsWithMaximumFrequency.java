// Last updated: 10/13/2025, 11:29:56 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
                int maxValue = Integer.MIN_VALUE;
            int ans =0;
            for(int i : nums){
                map.put(i,map.getOrDefault(i,0)+1);
                }
            for(int k : map.keySet()){
                if(maxValue < map.get(k) ){
                    maxValue = map.get(k);
                }
                

            }
            for(int y: map.keySet()){
                if(map.get(y)==maxValue){
                    ans+=map.get(y);
                }
            }
            return ans;
    }
}