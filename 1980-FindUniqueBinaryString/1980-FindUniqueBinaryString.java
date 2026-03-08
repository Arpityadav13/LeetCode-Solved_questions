// Last updated: 3/8/2026, 8:42:00 AM
1import java.util.*;
2
3class Solution {
4
5    String ans = "";
6
7    void generate(String str, int n, HashSet<String> set){
8
9        if(str.length() == n){
10            if(!set.contains(str)){
11                ans = str;
12            }
13            return;
14        }
15
16        if(ans.length() > 0) return;
17
18        generate(str + "0", n, set);
19        generate(str + "1", n, set);
20    }
21
22    public String findDifferentBinaryString(String[] nums) {
23
24        HashSet<String> set = new HashSet<>();
25
26        for(String s : nums){
27            set.add(s);
28        }
29
30        int n = nums.length;
31
32        generate("", n, set);
33
34        return ans;
35    }
36}