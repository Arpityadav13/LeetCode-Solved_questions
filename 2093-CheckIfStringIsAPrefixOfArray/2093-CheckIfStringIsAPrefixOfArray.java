// Last updated: 10/17/2025, 10:51:04 PM
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