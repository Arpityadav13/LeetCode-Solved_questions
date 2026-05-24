// Last updated: 5/24/2026, 11:08:41 AM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        List<Integer> list = new ArrayList<>();
5
6        for (int num : nums) {
7            int count = map.getOrDefault(num, 0);
8
9            if (count < k) {
10                list.add(num);
11                map.put(num, count + 1);
12            }
13        }
14
15        // Convert List<Integer> → int[]
16        int[] result = new int[list.size()];
17        
18        for (int i = 0; i < list.size(); i++) {
19            result[i] = list.get(i);
20        }
21
22        return result;
23    }
24}