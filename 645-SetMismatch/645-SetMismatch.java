// Last updated: 10/13/2025, 11:30:42 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int[] l =new int[2];
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                l[0]=nums[i];
            }set.add(nums[i]);
        }for(int i = 1;i<=nums.length;i++){
                        if (!set.contains(i)) {
                l[1] = i;
                break;
            }

        }

        return l;
    }
}