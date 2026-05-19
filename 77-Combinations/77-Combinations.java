// Last updated: 5/19/2026, 7:18:21 PM
1class Solution {
2    private List<List<Integer>> list = new ArrayList<>();
3    public List<List<Integer>> combine(int n, int k) {
4        List<Integer> l  = new ArrayList<>();
5        solve(1,n,l,k);
6        return list;
7    }
8    public void solve(int start,int n , List<Integer> temp , int k){
9        if(k==0){
10            list.add(new ArrayList<>(temp));
11            return ;
12        }
13        if(start>n){
14            return;
15        }
16        temp.add(start);
17        solve(start+1,n,temp,k-1);
18        temp.remove(temp.size()-1);
19        solve(start+1,n,temp,k);
20    }
21}