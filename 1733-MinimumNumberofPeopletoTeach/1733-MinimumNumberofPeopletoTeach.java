// Last updated: 1/11/2026, 6:59:32 PM
1import java.util.*;
2
3class Solution {
4    public int minimumTeachings(int totalLanguages, int[][] userLanguages, int[][] friendships) {
5        Set<Integer> usersToTeach = new HashSet<>();
6        
7        // Step 1: Find users who cannot communicate
8        for (int[] friendship : friendships) {
9            int u1 = friendship[0] - 1;
10            int u2 = friendship[1] - 1;
11            boolean canCommunicate = false;
12            
13            for (int lang1 : userLanguages[u1]) {
14                for (int lang2 : userLanguages[u2]) {
15                    if (lang1 == lang2) {
16                        canCommunicate = true;
17                        break;
18                    }
19                }
20                if (canCommunicate) break;
21            }
22            
23            if (!canCommunicate) {
24                usersToTeach.add(u1);
25                usersToTeach.add(u2);
26            }
27        }
28        
29        int minUsersToTeach = userLanguages.length + 1;
30        
31        // Step 2: Try each language
32        for (int lang = 1; lang <= totalLanguages; lang++) {
33            int count = 0;
34            
35            for (int user : usersToTeach) {
36                boolean knows = false;
37                for (int l : userLanguages[user]) {
38                    if (l == lang) {
39                        knows = true;
40                        break;
41                    }
42                }
43                if (!knows) count++;
44            }
45            
46            minUsersToTeach = Math.min(minUsersToTeach, count);
47        }
48        
49        return minUsersToTeach;
50    }
51}