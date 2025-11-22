// Last updated: 11/22/2025, 12:18:07 PM
class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        boolean firsttime =false;
        int count =0;
        for(String st : words){
            String s = "" + st.charAt(1) + st.charAt(0);
            if(map.containsKey(s) && map.get(s)>0){
                count +=4;
            map.put(s, map.get(s) - 1);
            continue;
            }
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(String key : map.keySet()){
            if(key.charAt(0)==key.charAt(1) && map.get(key)>0){
                
                firsttime=true;
                break;
            }}
            if (firsttime) count += 2;

        return count;
    }
}