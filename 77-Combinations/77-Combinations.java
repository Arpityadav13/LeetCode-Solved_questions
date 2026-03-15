// Last updated: 3/15/2026, 12:50:03 PM
1class Solution {
2    private List<List<Integer>> result = new ArrayList<>();
3    
4    public List<List<Integer>> combine(int n, int k) {
5        List<Integer> temp = new ArrayList<>();
6        solve(1,n,temp,k);
7        return result;
8    }
9    public void solve(int start,int n ,List<Integer> temp,int k){
10        if(k==0){
11            result.add(new ArrayList<>(temp));
12            return;
13        }
14        if(start>n){
15            return;
16
17        }
18        temp.add(start);
19        solve(start+1,n,temp,k-1);
20        temp.remove(temp.size()-1);
21        solve(start+1,n,temp,k);
22    }
23}
24
25