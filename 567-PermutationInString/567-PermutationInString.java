// Last updated: 10/13/2025, 11:30:44 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] window = new int[26];

        for(int i  = 0;i<s1.length();i++){
            need[s1.charAt(i)-'a']++;
        }
        
        int left = 0 ,right = 0;
        while(right<s2.length()){
            char c = s2.charAt(right);
            window[c-'a']++;
            if(right-left+1==s1.length()){
                if(match(need,window)){
                    return true;
                }
                window[s2.charAt(left)-'a']--;
                left++;
            }
            right++;

        }
        return false;
        
    }
    private boolean match(int[] need , int[] window){
        for(int i = 0; i<26;i++){
            if(need[i] != window[i]){
                return false;
            }
        }
        return true;
    }
}