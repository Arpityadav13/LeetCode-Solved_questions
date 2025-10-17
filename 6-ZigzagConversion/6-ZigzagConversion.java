// Last updated: 10/17/2025, 3:52:55 PM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1) return s;
        String p ="";
        for(int r = 0; r<numRows;r++){
            int inc = 2*(numRows-1);
            for(int i =r;i<s.length();i+=inc){
                p+=s.charAt(i);
                if(r>0 && r<numRows-1 && i+inc -2*r <s.length()){
                    p+=s.charAt(i+inc-2*r);

                }
            }
            
        }
        return p;
    }
}