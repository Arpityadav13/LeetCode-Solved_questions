// Last updated: 10/27/2025, 10:56:07 PM
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, maxscore =0;
        int left=0,right=tokens.length-1;
        while(left<=right){
            if(power>=tokens[left]){
                power-= tokens[left++];
                score++;
                maxscore =Math.max(maxscore,score);
            }else if(score>0){
                power+=tokens[right--];
                score--;
            }else{
                break;
            }
        }
        return maxscore;

    }
}