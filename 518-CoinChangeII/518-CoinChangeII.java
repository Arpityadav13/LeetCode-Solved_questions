// Last updated: 5/18/2026, 9:47:55 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        int n= coins.length;
4        int[][] t = new int[n+1][amount+1];
5        for(int i = 0; i <=n;i++){
6            t[i][0] = 1 ;
7
8        }
9        for(int j = 1;j<=amount;j++){
10            t[0][j] = 0;
11        }
12        for(int i = 1; i<=n;i++){
13            for(int j =1;j<=amount;j++){
14                if(coins[i-1]<=j){
15                    t[i][j]  = t[i][j-coins[i-1]] + t[i-1][j];
16                }else{
17                    t[i][j] = t[i-1][j];
18                }
19            }
20        }
21        return t[n][amount];
22    }
23}