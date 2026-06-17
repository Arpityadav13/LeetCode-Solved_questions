// Last updated: 6/17/2026, 9:41:53 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int i = 0;
5        int ans = 0;
6        
7        for(int j= 0;j<s.length();j++){
8            char ch = s.charAt(j);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10            while(map.get(ch)>1){
11                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
12                i++;
13            }
14            ans = Math.max(ans,j-i+1);
15
16        }
17        return ans;
18    }
19}