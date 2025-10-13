// Last updated: 10/13/2025, 11:30:28 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l = new ArrayList<>();
        if(words.length==0) return l;
        l.add(words[0]);
        for(int i = 1;i<words.length;i++){
            char[] prev = words[i-1].toCharArray();
            char[] curr = words[i].toCharArray();
            Arrays.sort(prev);
            Arrays.sort(curr);
            if(!Arrays.equals(prev,curr)){
                l.add(words[i]);
            }

        }
        return l;
    }
}