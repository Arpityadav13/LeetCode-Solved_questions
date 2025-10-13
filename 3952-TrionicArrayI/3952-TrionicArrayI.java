// Last updated: 10/13/2025, 11:29:40 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int lengthofnums = nums.length;
        for(int x= 1; x<lengthofnums-2; x++){
            
            boolean increasing = true;
            for(int i= 0 ; i<x;i++){
            if(nums[i]>= nums[i+1]){
                increasing = false;
                break;
            }
            
        }
        if(!increasing) continue;
        for(int y= x+1; y<lengthofnums-1; y++){
            boolean decreasing = true;
            for(int j = x;j<y;j++){
            if(nums[j]<= nums[j+1]){
                decreasing = false;
                break;
            }
            
        }
        if(!decreasing) continue;
        boolean increasing2 = true;
        for(int k= y; k<lengthofnums-1; k++){
            
            if(nums[k]>= nums[k+1]){
                increasing2 = false;
                break;
            }
            
        }
        if(increasing2) return true;}
        }

    return false;
        
    }
    
}