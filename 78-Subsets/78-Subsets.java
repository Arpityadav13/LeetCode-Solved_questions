// Last updated: 5/19/2026, 8:16:45 PM
1class Solution {
2    private List<List<Integer>> list = new ArrayList<>();
3    public List<List<Integer>> subsets(int[] nums) {
4        List<Integer> temp  = new ArrayList<>();
5        int start =0;
6        solve(nums,temp,start);
7        return list;
8    }
9    public void solve(int[] nums,List<Integer> temp,int start){
10        if(start>=nums.length){
11            list.add(new ArrayList<>(temp));
12            return;
13        }
14        temp.add(nums[start]);
15        solve(nums,temp,start+1);
16        temp.remove(temp.size()-1);
17        solve(nums,temp,start+1);
18        
19    }
20}