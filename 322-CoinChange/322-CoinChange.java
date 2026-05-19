// Last updated: 5/19/2026, 10:21:47 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4        int[][] t = new int[n+1][amount+1];
5        for(int i =0 ;i<=amount;i++){
6            t[0][i]=Integer.MAX_VALUE-1;
7        }
8        for(int j = 1;j<=n;j++){
9            t[j][0] = 0;
10        }
11        for(int j=1;j<=amount;j++){
12            if(j%coins[0] != 0){
13            t[1][j] = Integer.MAX_VALUE-1;
14        }else{
15            t[1][j] =  j / coins[0];
16        }
17        }
18        for(int i =2;i<=n;i++){
19            for(int j =1;j<=amount;j++){
20                if(coins[i-1]<=j){
21                    t[i][j] = Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
22                }else{
23                    t[i][j] = t[i-1][j];
24                }
25
26            }
27        }
28        if(t[n][amount] == Integer.MAX_VALUE || t[n][amount] == Integer.MAX_VALUE-1){
29            return -1;
30        }
31        return t[n][amount];
32        
33        }
34}