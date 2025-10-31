// Last updated: 10/31/2025, 8:37:54 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] output = new int[2];
        int i =0;
         for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==2){
                output[i]=key;
                i++;
                
            }
        }

        return output;
    }
}