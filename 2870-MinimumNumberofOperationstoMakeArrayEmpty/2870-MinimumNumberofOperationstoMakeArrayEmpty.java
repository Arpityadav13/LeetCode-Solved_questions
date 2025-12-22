// Last updated: 12/22/2025, 2:30:43 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int output = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8        for(int key : map.keySet()){
9            int feq =map.get(key);
10            if(feq==1){
11                return -1;
12            }
13            if(feq%3==0){
14                output+=feq/3;
15            }else if(feq%3==1) {
16                output+=(feq-4)/3+2;
17            }else{
18                output+=feq/3+1;
19            }
20        }
21        return output;
22    }
23}