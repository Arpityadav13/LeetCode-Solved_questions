// Last updated: 1/31/2026, 5:54:33 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(int i  = 0 ;i<letters.length;i++){
4            if(letters[i]-'a'>target-'a'){
5                return letters[i];
6            }
7        }
8        return letters[0];
9    }
10}