// Last updated: 10/13/2025, 11:32:25 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();
        int index =0;
        for(int i =0 ;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            nums[index]=nums[i];
            index++;
        }
        return index;
    }
}