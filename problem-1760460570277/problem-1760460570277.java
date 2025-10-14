// Last updated: 10/14/2025, 10:19:30 PM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for (int i = 0; i + 2 * k <= n; i++) {
            boolean first = true, second = true;

            // check first subarray
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    first = false;
                    break;
                }
            }

            // check second subarray
            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    second = false;
                    break;
                }
            }

            if (first && second) return true;
        }

        return false;
    }
}
