// Last updated: 11/11/2025, 10:52:30 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) return "";
        char[] arr = palindrome.toCharArray();
        for(int i =0;i<arr.length/2;i++){
            if(arr[i]!='a'){
                arr[i]='a';
                return new String(arr);
            }
        }
        arr[arr.length-1]='b';
        return new String(arr);
    }
}