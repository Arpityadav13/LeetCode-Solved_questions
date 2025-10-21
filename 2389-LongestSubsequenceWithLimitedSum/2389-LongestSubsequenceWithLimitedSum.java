// Last updated: 10/21/2025, 11:38:25 PM
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] k = new int[queries.length];
        for(int j = 0;j<queries.length;j++){
            int sum = 0;
            int count = 0;
            for(int i = 0;i<nums.length;i++){
            if(sum + nums[i] > queries[j]){
                break;
            }
            sum+=nums[i];
            count++;
           
            

        }
        k[j]=count;
        }
        return k;
        
    }
}