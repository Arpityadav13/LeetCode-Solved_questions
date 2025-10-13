// Last updated: 10/13/2025, 11:31:08 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(char c : magazine.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char k : map.keySet()){
            if (map1.getOrDefault(k, 0) < map.get(k)) {
            return false;}
        }
      return true;  
    }
}