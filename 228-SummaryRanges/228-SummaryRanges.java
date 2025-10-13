// Last updated: 10/13/2025, 11:31:26 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
       
        List<String> list = new ArrayList<>();
        if(nums.length==0) return list;
         int j =nums[0];
        for(int i = 1 ; i<nums.length;i++){
            if((nums[i]!=nums[i-1]+1)){
                if(j==nums[i-1]){
                    list.add(String.valueOf(j));
                }else{                    
                    
                    list.add(j + "->" + nums[i - 1]);
                }
                j=nums[i];
            }
        }
        if (j == nums[nums.length - 1]) {
            list.add(String.valueOf(j));
        } else {
            list.add(j + "->" + nums[nums.length - 1]);
        }
        return list;
    }
}