// Last updated: 1/22/2026, 11:29:17 PM
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        ArrayList<Integer> list = new ArrayList<>();
4        for (int a : nums) list.add(a);
5
6        int count = 0;
7
8        while (!isNonDecreasing(list)) {
9            int min = Integer.MAX_VALUE;
10            int index = 0;
11            int n = list.size();
12
13            for (int i = 0; i < n - 1; i++) {
14                int val = list.get(i) + list.get(i + 1);
15                if (val < min) {
16                    min = val;
17                    index = i;
18                }
19            }
20
21            list.set(index, min);
22            list.remove(index + 1);
23            count++;
24        }
25
26        return count;
27    }
28
29    private boolean isNonDecreasing(ArrayList<Integer> list) {
30        for (int i = 1; i < list.size(); i++) {
31            if (list.get(i) < list.get(i - 1)) return false;
32        }
33        return true;
34    }
35}