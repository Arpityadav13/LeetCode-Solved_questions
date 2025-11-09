// Last updated: 11/10/2025, 12:28:35 AM
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int out =0;
        for(int task : tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                return -1;
            }
            if(map.get(key)==2 || map.get(key)==3){
                out++;
            }
            else if(map.get(key)%3==0){
                out=out+map.get(key)/3;
            }else{
                out=out+(map.get(key)/3)+1;
            }
        }
        return out;
    }
}