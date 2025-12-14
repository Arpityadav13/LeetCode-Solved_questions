// Last updated: 12/14/2025, 11:12:52 AM
1import java.util.*;
2
3class Solution {
4    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
5
6        // Business line priority
7        Map<String, Integer> priority = new HashMap<>();
8        priority.put("electronics", 0);
9        priority.put("grocery", 1);
10        priority.put("pharmacy", 2);
11        priority.put("restaurant", 3);
12
13        List<Pair> valid = new ArrayList<>();
14
15        for (int i = 0; i < code.length; i++) {
16            if (isActive[i] && priority.containsKey(businessLine[i]) && isValidCode(code[i])) {
17                valid.add(new Pair(priority.get(businessLine[i]), code[i]));
18            }
19        }
20
21        // Sort by business priority, then by code
22        Collections.sort(valid, (a, b) -> {
23            if (a.priority != b.priority)
24                return a.priority - b.priority;
25            return a.code.compareTo(b.code);
26        });
27
28        List<String> result = new ArrayList<>();
29        for (Pair p : valid) {
30            result.add(p.code);
31        }
32
33        return result;
34    }
35
36    private boolean isValidCode(String s) {
37        if (s.length() == 0) return false;
38        for (char c : s.toCharArray()) {
39            if (!Character.isLetterOrDigit(c) && c != '_')
40                return false;
41        }
42        return true;
43    }
44
45    // Helper class to store (priority, code)
46    static class Pair {
47        int priority;
48        String code;
49
50        Pair(int priority, String code) {
51            this.priority = priority;
52            this.code = code;
53        }
54    }
55}