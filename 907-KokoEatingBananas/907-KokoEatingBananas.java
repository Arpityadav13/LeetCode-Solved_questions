// Last updated: 10/13/2025, 11:30:32 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;

        int high = piles[0];
        for (int pile : piles) {
            if (pile > high) {
                high = pile;
            }
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long time = 0;
            for (int pile : piles) {
                time += (pile + mid - 1L) / mid;
            }

            if (time <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
