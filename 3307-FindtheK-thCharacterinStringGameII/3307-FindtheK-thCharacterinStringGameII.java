// Last updated: 3/26/2026, 12:43:48 AM
1class Solution {
2    public char kthCharacter(long k, int[] operations) {
3        if (k == 1) return 'a';
4
5        int n = operations.length;
6        long len = 1;
7        long newk = 1;
8        int operationType = 0;
9
10        for (int i = 0; i < n; i++) {
11            len *= 2;
12            if (len >= k) {
13                operationType = operations[i];
14                newk = k - len / 2;
15                break;
16            }
17        }
18
19        char ch = kthCharacter(newk, operations);
20
21        if (operationType == 0) {
22            return ch;
23        }
24
25        return ch == 'z' ? 'a' : (char)(ch + 1);
26    }
27}