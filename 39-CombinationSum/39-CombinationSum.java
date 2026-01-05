// Last updated: 1/5/2026, 11:32:23 PM
1class Solution {
2    List<List<Integer>> res=new ArrayList<>();
3    public void backtrack(int[]candidates,int target,ArrayList<Integer> temp,int sum,int idx){
4        if(sum>target) return;
5        if(sum==target){
6            res.add(new ArrayList<Integer>(temp));
7            return;
8        }
9        for(int i=idx;i<candidates.length;i++){
10            temp.add(candidates[i]);
11            backtrack(candidates,target,temp,sum+candidates[i],i);
12            temp.remove(temp.size()-1);
13        }
14    }
15    public List<List<Integer>> combinationSum(int[] candidates, int target) {
16        ArrayList<Integer> temp=new ArrayList<>();
17        backtrack(candidates,target,temp,0,0);
18        return res;
19    }
20}