// Last updated: 1/1/2026, 9:06:52 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4	if (digits[i] < 9) {
5		digits[i]++;
6		return digits;
7	}
8	digits[i] = 0;
9}
10
11digits = new int[digits.length + 1];
12digits[0] = 1;
13return digits;
14        
15    }
16}