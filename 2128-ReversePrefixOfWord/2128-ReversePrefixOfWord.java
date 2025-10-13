// Last updated: 10/13/2025, 11:30:06 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int i ;
        String st ="";
        for(i = 0;i<word.length();i++){
            if(word.charAt(i)==ch){
                int j = i;
                while(j>=0){
                    st = st+word.charAt(j);
                    j--;

                }
                break;
            }
        }
        if (i == word.length()) return word;

        for(int k = i+1;k<word.length();k++){
             st = st+word.charAt(k);
        }
       return st; 
    }
}