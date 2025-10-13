// Last updated: 10/13/2025, 11:31:05 PM
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char key : t.toCharArray()){
            if(!map.containsKey(key) || map.get(key)==0){
                return key;

            }else{
                map.put(key,map.get(key)-1);
            }
        }
      return ' ';  
    }
}