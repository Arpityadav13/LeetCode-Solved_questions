// Last updated: 6/5/2026, 4:55:15 PM
1class Solution {
2    public int numMatchingSubseq(String s, String[] words) {
3
4        List<Integer>[] pos = new ArrayList[26];
5
6        for (int i = 0; i < 26; i++) {
7            pos[i] = new ArrayList<>();
8        }
9
10        for (int i = 0; i < s.length(); i++) {
11            pos[s.charAt(i) - 'a'].add(i);
12        }
13
14        int ans = 0;
15
16        for (String word : words) {
17
18            int prev = -1;
19            boolean ok = true;
20
21            for (char ch : word.toCharArray()) {
22
23                List<Integer> list = pos[ch - 'a'];
24
25                int idx = Collections.binarySearch(list, prev + 1);
26
27                if (idx < 0) {
28                    idx = -idx - 1;
29                }
30
31                if (idx == list.size()) {
32                    ok = false;
33                    break;
34                }
35
36                prev = list.get(idx);
37            }
38
39            if (ok) ans++;
40        }
41
42        return ans;
43    }
44}