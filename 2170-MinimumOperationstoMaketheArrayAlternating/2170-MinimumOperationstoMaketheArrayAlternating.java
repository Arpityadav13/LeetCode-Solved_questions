// Last updated: 1/13/2026, 12:13:50 AM
1import java.util.*;
2
3class Solution {
4    public int minimumOperations(int[] nums) {
5        HashMap<Integer, Integer> evenplace = new HashMap<>();
6        HashMap<Integer, Integer> oddplace = new HashMap<>();
7
8        for (int i = 0; i < nums.length; i++) {
9            if (i % 2 == 0)
10                evenplace.put(nums[i], evenplace.getOrDefault(nums[i], 0) + 1);
11            else
12                oddplace.put(nums[i], oddplace.getOrDefault(nums[i], 0) + 1);
13        }
14
15        int[] evenTop = topTwo(evenplace);
16        int[] oddTop = topTwo(oddplace);
17
18        int evenVal1 = evenTop[0], evenCnt1 = evenTop[1];
19        int evenCnt2 = evenTop[2];
20
21        int oddVal1 = oddTop[0], oddCnt1 = oddTop[1];
22        int oddCnt2 = oddTop[2];
23
24        int evenTotal = (nums.length + 1) / 2;
25        int oddTotal = nums.length / 2;
26
27        if (evenVal1 != oddVal1) {
28            return (evenTotal - evenCnt1) + (oddTotal - oddCnt1);
29        }
30
31        return Math.min(
32            (evenTotal - evenCnt1) + (oddTotal - oddCnt2),
33            (evenTotal - evenCnt2) + (oddTotal - oddCnt1)
34        );
35    }
36
37    private int[] topTwo(HashMap<Integer, Integer> map) {
38        int val1 = -1, cnt1 = 0;
39        int cnt2 = 0;
40
41        for (int k : map.keySet()) {
42            int c = map.get(k);
43            if (c > cnt1) {
44                cnt2 = cnt1;
45                cnt1 = c;
46                val1 = k;
47            } else if (c > cnt2) {
48                cnt2 = c;
49            }
50        }
51        return new int[]{val1, cnt1, cnt2};
52    }
53}
54