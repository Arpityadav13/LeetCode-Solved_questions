// Last updated: 3/5/2026, 11:19:01 PM
1class Solution {
2    public int minOperations(String s) {
3        int count = 0, n = s.length();
4        for (int i = 0; i < n; i++)
5            count += (s.charAt(i) ^ i) & 1;
6          
7        return Math.min(count, n - count);
8    }
9}