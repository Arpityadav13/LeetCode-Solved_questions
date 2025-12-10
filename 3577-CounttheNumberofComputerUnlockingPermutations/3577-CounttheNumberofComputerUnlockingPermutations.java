// Last updated: 12/10/2025, 4:18:02 PM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int countPermutations(int[] comp) {
5        int n = comp.length;
6        int first = comp[0];
7
8        // Check that first is the unique minimum
9        for (int i = 1; i < n; i++) {
10            if (comp[i] <= first) return 0;
11        }
12
13        // Compute factorial (n-1)!
14        long fact = 1;
15        for (int i = 2; i < n; i++) {
16            fact = (fact * i) % MOD;
17        }
18
19        return (int) fact;
20    }
21}