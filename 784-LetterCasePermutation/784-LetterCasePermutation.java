// Last updated: 3/14/2026, 11:07:17 PM
1class Solution {
2    private List<List<Integer>> result = new ArrayList<>();
3    private HashSet<Integer> set =new HashSet<>();
4    public List<List<Integer>> permute(int[] nums) {
5        List<Integer> temp = new ArrayList<>();
6        solve(nums,temp);
7        return result;
8    }
9    public void solve(int[] nums,List<Integer> temp){
10        if(temp.size() == nums.length){
11            result.add(new ArrayList<>(temp));
12            return ;
13        }
14        for(int i= 0;i<nums.length;i++){
15            if(!set.contains(nums[i])){
16                temp.add(nums[i]);
17                set.add(nums[i]);
18                solve(nums,temp);
19                set.remove(nums[i]);
20                temp.remove(temp.size()-1);
21            }
22        }
23    }
24}