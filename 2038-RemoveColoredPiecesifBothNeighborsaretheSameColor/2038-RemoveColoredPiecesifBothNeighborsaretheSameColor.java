// Last updated: 11/11/2025, 10:01:34 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        int a =0;
        int b=0;
            for(int i =1 ;i<colors.length()-1;i++){
                if(colors.charAt(i)==colors.charAt(i+1) && colors.charAt(i)==colors.charAt(i-1)){
                    if(colors.charAt(i)=='A'){
                        a++;
                    }else{
                        b++;
                    }
                }
    }
    if(a>b){
        return true;
    }else{
        return false;
    }
}
}