// Last updated: 11/10/2025, 10:07:58 PM
class Solution {
    public int minDeletions(String s) {
        HashSet<Integer> set = new HashSet<>();
        int[] freq  =new int[26];
        int output = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int f : freq){
            int k = f;
            while(k>0 && set.contains(k)){
                k--;
                output++;

            }
           if (k > 0) set.add(k);
        }

     return output;   
    }
}