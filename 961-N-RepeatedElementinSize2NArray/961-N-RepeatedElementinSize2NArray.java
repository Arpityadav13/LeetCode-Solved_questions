// Last updated: 1/2/2026, 5:59:54 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        for(int key : map.keySet()){
8            if(map.get(key)==nums.length/2){
9                return key;
10            }
11        }
12        return -1;
13    }
14}