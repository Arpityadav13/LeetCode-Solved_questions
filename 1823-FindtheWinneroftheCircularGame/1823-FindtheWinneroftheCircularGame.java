// Last updated: 3/24/2026, 2:42:28 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int idx = solve(n,k);
4        return idx+1;
5    }
6    public int solve(int n,int k){
7        if(n==1){
8            return 0;
9        }
10        int idx = solve(n-1,k);
11        idx = (idx+k)%n;
12        return idx;
13    }
14}