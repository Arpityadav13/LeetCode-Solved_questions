// Last updated: 5/27/2026, 11:23:22 PM
1class Solution {
2    public int lastStoneWeightII(int[] stones) {
3        int sum = 0;
4        for(int num : stones){
5            sum += num;
6        }
7        return helper(stones,sum/2,stones.length,sum);
8    }
9    public int helper(int[] stones,int sum,int n,int total){
10        boolean[][] t = new boolean[n+1][sum+1];
11        for(int i = 0;i<=n;i++){
12            t[i][0] = true;
13        }
14       
15        for(int i =1;i<=n;i++){
16            for(int j =1;j<=sum;j++){
17                if(stones[i-1]<=j){
18                    t[i][j]=t[i-1][j-stones[i-1]] || t[i-1][j];
19                }else{
20                    t[i][j] = t[i-1][j];
21                }
22            }
23        }
24        int s1 = 0;
25
26        for(int j = sum; j >= 0; j--){
27            if(t[stones.length][j]){
28                s1 = j;
29                break;
30            }
31        }
32
33        return total - 2*s1;
34}}