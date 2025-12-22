// Last updated: 12/22/2025, 2:30:29 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int output = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8        for (int key : map.keySet()) {
9    System.out.println("Key: " + key + ", Value: " + map.get(key));
10}
11        for(int key : map.keySet()){
12            int feq =map.get(key);
13            if(feq==1){
14                return -1;
15            }
16            if(feq%3==0){
17                output+=feq/3;
18            }else if(feq%3==1) {
19                output+=(feq-4)/3+2;
20            }else{
21                output+=feq/3+1;
22            }
23        }
24        return output;
25    }
26}