// Last updated: 10/13/2025, 11:30:21 PM
class Solution {
    public int maxScore(String s) {
        int score = Integer.MIN_VALUE , zero=0,one=0;
        int n =s.length();
        for(int i = 0 ; i<=n-2;i++){
            if(s.charAt(i)=='1') {
                one++;}
                else {
                    zero++;}
            
            score = Math.max(score,(zero-one));

        }
        if(s.charAt(n-1)== '1') one++;
        return score + one;
    }
}