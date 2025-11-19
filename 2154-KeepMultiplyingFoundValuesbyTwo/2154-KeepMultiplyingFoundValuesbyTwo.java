// Last updated: 11/19/2025, 9:15:46 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        while(true){
            if(!set.contains(original)){
                return original;
            }else{
                original=original*2;
            }
        }
       
    }
}