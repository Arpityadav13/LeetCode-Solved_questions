// Last updated: 12/8/2025, 11:02:09 PM
1class Solution {
2    public int countTriples(int n) {
3        int res = 0;
4        for (int u = 2; u * u <= n; u++) {
5            for (int v = 1; v < u; v++) {
6                if (((u - v) & 1) == 0 || gcd(u, v) != 1) continue;
7                int c = u * u + v * v;
8                if (c > n) continue;
9
10                res += (n / c) << 1;
11            }
12        }
13        return res;
14    }
15
16    int gcd(int x, int y) {
17        return y == 0 ? x : gcd(y, x % y);
18    }
19}
20