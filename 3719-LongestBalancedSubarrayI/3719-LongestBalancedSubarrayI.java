// Last updated: 2/10/2026, 10:52:45 AM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int maxlen=Integer.MIN_VALUE;
4        for(int i=0;i<nums.length;i++){
5            HashSet<Integer> set1=new HashSet<>();
6            HashSet<Integer> set2=new HashSet<>();
7            for(int j=i;j<nums.length;j++){
8                if(nums[j]%2==0){
9                   set1.add(nums[j]);
10                }
11                else{
12                    set2.add(nums[j]);
13                }
14                if(set1.size()==set2.size()){
15                    maxlen=Math.max(maxlen,j-i+1);
16                }
17            }
18        }
19        if(maxlen==Integer.MIN_VALUE){
20            return 0;
21        }
22        return maxlen;
23    }
24}