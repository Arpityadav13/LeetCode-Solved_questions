// Last updated: 12/27/2025, 11:12:58 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> result = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5
6        for (int num : nums) {
7            set.add(num);
8        }
9
10        int n = nums.length;
11        for (int i = 1; i <= n; i++) {
12            if (!set.contains(i)) {
13                result.add(i);
14            }
15        }
16
17        return result;
18    }
19}
20