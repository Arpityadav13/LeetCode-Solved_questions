// Last updated: 10/13/2025, 11:30:20 PM
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> path : paths){
            set.add(path.get(0));
        }
        for(List<String> path : paths){
            String p = path.get(1);
            if(!set.contains(p)){
                return p;
            }
        }
       return ""; 
    }
}