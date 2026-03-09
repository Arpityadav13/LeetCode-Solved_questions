// Last updated: 3/10/2026, 12:39:15 AM
1class Solution {
2
3    public int numberOfStableArrays(int zero, int one, int limit) {
4        int MOD = 1000000007;
5        // dp[z][o][0] -> ways where last element is 0
6        // dp[z][o][1] -> ways where last element is 1
7        long[][][] dp = new long[zero + 1][one + 1][2];
8        // base cases: only zeros
9        for(int i = 1; i <= Math.min(zero, limit); i++) {
10            dp[i][0][0] = 1;
11        }
12        // base cases: only ones
13        for(int j = 1; j <= Math.min(one, limit); j++) {
14            dp[0][j][1] = 1;
15        }
16        for(int z = 1; z <= zero; z++) {
17            for(int o = 1; o <= one; o++) {
18                // place 0 at the end
19                dp[z][o][0] = (dp[z-1][o][0] + dp[z-1][o][1]) % MOD;
20
21                if(z - limit - 1 >= 0) {
22                    dp[z][o][0] = (dp[z][o][0] - dp[z-limit-1][o][1] + MOD) % MOD;
23                }
24                // place 1 at the end
25                dp[z][o][1] = (dp[z][o-1][0] + dp[z][o-1][1]) % MOD;
26
27                if(o - limit - 1 >= 0) {
28                    dp[z][o][1] = (dp[z][o][1] - dp[z][o-limit-1][0] + MOD) % MOD;
29                }
30            }
31        }
32        return (int)((dp[zero][one][0] + dp[zero][one][1]) % MOD);
33    }
34}