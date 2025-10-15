// Last updated: 10/15/2025, 9:36:08 PM
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String word ="";
        for(int i = 0; i<words.length;i++){
            word = word + words[i];
            if(s.equals(word)){
                return true;
        }
        }
        return false;
    }
}