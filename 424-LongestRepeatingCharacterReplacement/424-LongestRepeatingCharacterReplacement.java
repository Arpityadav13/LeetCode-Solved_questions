// Last updated: 10/13/2025, 11:30:57 PM
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlen = 0,maxcount=0;
        int left = 0;
        for(int r = 0; r<s.length();r++){
            char c= s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            maxcount = Math.max(maxcount,map.get(c));
            int windowSize = r-left+1;
            if(windowSize-maxcount>k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}