// Last updated: 3/24/2026, 12:07:29 AM
1class Solution {
2    public int kthGrammar(int n, int k) {
3        int output = solve(n,k);
4        return output;
5    }
6    public int solve(int n , int k){
7        if(n==1 && k==1){
8            return 0;
9
10        }
11        int length =  (int)Math.pow(2,n-1);
12        int mid = length/2;
13        if(k<=mid){
14            return solve(n-1,k);
15        }else{
16            return 1-solve(n-1,k-mid);
17        }
18    }
19}