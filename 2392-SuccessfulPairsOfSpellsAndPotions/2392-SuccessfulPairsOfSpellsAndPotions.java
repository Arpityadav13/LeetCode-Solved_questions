// Last updated: 10/13/2025, 11:30:00 PM
import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // Sort potions first
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];

            // Minimum potion value needed for success
            long minPotion = (success + spell - 1) / spell;  // ceil(success / spell)

            // Binary search for first potion >= minPotion
            int index = lowerBound(potions, minPotion);

            // All potions from index to end are successful
            result[i] = m - index;
        }
        return result;
    }

    // Custom lower bound implementation
    private int lowerBound(int[] arr, long target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
