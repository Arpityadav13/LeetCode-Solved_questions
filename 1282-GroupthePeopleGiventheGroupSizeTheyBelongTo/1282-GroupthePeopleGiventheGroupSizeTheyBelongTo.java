// Last updated: 1/8/2026, 3:25:36 PM
1class Solution {
2    public List<List<Integer>> groupThePeople(int[] groupSizes) {
3
4        List<List<Integer>> result = new ArrayList<>();
5        HashMap<Integer, List<Integer>> map = new HashMap<>();
6
7        for (int i = 0; i < groupSizes.length; i++) {
8            int size = groupSizes[i];
9
10            map.computeIfAbsent(size, k -> new ArrayList<>()).add(i);
11
12            if (map.get(size).size() == size) {
13                result.add(map.get(size));
14                map.remove(size); // start fresh group
15            }
16        }
17        return result;
18    }
19}
20