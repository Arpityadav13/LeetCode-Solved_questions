// Last updated: 10/13/2025, 11:32:35 PM
class Solution {
    public String longestPalindrome(String s) {
        String g= "";
         for (int left = 0; left < s.length(); left++) {
            for (int right = left; right < s.length(); right++) {
                String substring = s.substring(left, right + 1);

                if (isPalindrome(substring) && substring.length() > g.length()) {
                    g = substring;
                }
            }
        }
        return g;
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}