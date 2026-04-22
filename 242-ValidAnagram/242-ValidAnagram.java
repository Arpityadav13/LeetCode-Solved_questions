// Last updated: 4/22/2026, 4:49:38 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4        int[] arr1 = new int[26];
5        int[] arr2 = new int[26];
6        for(int i = 0;i<s.length();i++){
7            arr1[s.charAt(i)-'a']++;
8            arr2[t.charAt(i)-'a']++;
9        }
10        for(int i = 0;i<26;i++){
11            if(arr1[i] != arr2[i]){
12                return false;
13            }
14        }
15        return true;
16
17
18    }
19}