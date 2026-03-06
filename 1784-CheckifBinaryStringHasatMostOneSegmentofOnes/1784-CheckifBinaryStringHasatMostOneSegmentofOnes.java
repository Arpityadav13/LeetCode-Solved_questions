// Last updated: 3/7/2026, 1:31:22 AM
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        boolean zeroSeen = false;
4
5        for(char c : s.toCharArray()){
6            if(c == '0'){
7                zeroSeen = true;
8            }
9            if(c == '1' && zeroSeen){
10                return false;
11            }
12        }
13        return true;
14    }
15}