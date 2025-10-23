// Last updated: 10/23/2025, 9:23:00 PM
class Solution {
    public boolean hasSameDigits(String s) {
        int i = 0;
        while(s.length()>2){
        String k = "";
        for(int j =1;j<s.length();j++){
           k=k+ (s.charAt(j-1) + s.charAt(j)) % 10 ;

        }
        s=k;
        i++;
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        return false;
    }
}