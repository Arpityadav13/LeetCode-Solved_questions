// Last updated: 11/10/2025, 4:36:18 PM
class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        boolean[] visited = new boolean[n];

        int d =0;
        int r =0;
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='D'){
                d++;
            }else{
                r++;
            }

        }
        while(d>0 && r>0){
     for (int i = 0; i < n && d > 0 && r > 0; i++) {

                if (visited[i]) continue;
                char curr = senate.charAt(i);

                // Search to the right for opponent
                boolean visitedSomeone = false;
                for (int j = i + 1; j < n; j++) {
                    if (!visited[j] && senate.charAt(j) != curr) {
                        visited[j] = true;
                        if (senate.charAt(j) == 'D') d--;
                        else r--;
                        visitedSomeone = true;
                        break;
                    }
                }

                
                if (!visitedSomeone) {
                    for (int j = 0; j < i; j++) {
                        if (!visited[j] && senate.charAt(j) != curr) {
                            visited[j] = true;
                            if (senate.charAt(j) == 'D') d--;
                            else r--;
                            break;
                        }
                    }
                }

            }
        }

        return (d > 0) ? "Dire" : "Radiant";}}