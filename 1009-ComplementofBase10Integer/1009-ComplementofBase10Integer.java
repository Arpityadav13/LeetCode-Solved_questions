// Last updated: 3/11/2026, 9:02:47 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3        int bits = Integer.toBinaryString(n).length();
4        int mask = (1 << bits) - 1;
5
6        int complement = n ^ mask;
7        return complement;
8    }
9}