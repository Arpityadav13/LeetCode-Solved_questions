// Last updated: 11/9/2025, 11:53:23 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length() ) return -1;
       
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0) && i+needle.length()-1<haystack.length()){
                String s =haystack.substring(i,i+needle.length());
                if(s.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}