// Last updated: 10/13/2025, 11:30:17 PM
import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        // TreeSet stores sunny day indices in sorted order (acts like binary search)
        TreeSet<Integer> sunnyDays = new TreeSet<>();
        // Map lake → last rainy day
        Map<Integer, Integer> fullLakes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int lake = rains[i];

            if (lake == 0) {
                // sunny day
                sunnyDays.add(i);
                ans[i] = 1;  // default (might be updated)
            } else {
                // rainy day
                if (fullLakes.containsKey(lake)) {
                    int lastDay = fullLakes.get(lake);
                    // binary search: find sunny day > lastDay
                    Integer dryDay = sunnyDays.higher(lastDay); // TreeSet.higher = binary search
                    if (dryDay == null) {
                        return new int[0]; // flood: no available sunny day
                    }

                    // Use that sunny day to dry this lake
                    ans[dryDay] = lake;
                    sunnyDays.remove(dryDay);
                }

                // Update the lake as now full
                fullLakes.put(lake, i);
                ans[i] = -1; // raining day
            }
        }
        return ans;
    }
}
