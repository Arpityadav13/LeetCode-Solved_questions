// Last updated: 11/10/2025, 2:45:52 PM
class Solution {
    public int partitionString(String s) {
        int[] arr = new int[26];
        int output =1;
        for(int i= 0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>1){
                Arrays.fill(arr, 0); 
                output++;
                arr[s.charAt(i)-'a']++;
            }
        }
        
        return output;
    }
}