// Last updated: 4/26/2026, 1:16:22 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int maxlen= 0 ;
5        int left = 0;
6        for(int right = 0;right<s.length();right++){
7            char c = s.charAt(right);
8            if(map.containsKey(c) && map.get(c) >= left){
9                left = map.get(c)+1;
10            }
11        map.put(c,right);
12        maxlen=Math.max(maxlen,right-left+1);
13        }
14        return maxlen;
15    }
16}