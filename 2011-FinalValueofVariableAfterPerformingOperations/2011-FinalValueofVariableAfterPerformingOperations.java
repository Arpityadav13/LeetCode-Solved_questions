// Last updated: 10/20/2025, 8:49:16 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0 ;
        for(int i =0;i<operations.length;i++){
            String s1= operations[i];
            if(s1.equals("--X") || s1.equals("X--")){
                x=x-1;
            }else{
                x=x+1;
            }
        }
        return x;
        
    }
}