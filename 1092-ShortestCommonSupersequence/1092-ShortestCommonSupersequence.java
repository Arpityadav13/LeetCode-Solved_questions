// Last updated: 5/30/2026, 11:16:33 PM
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int m = str1.length();
4        int n = str2.length();
5        int[][] t = new int[m+1][n+1];
6        for(int i  = 0;i<=m;i++){
7            for(int j = 0;j<=n;j++){
8                if(i==0 || j==0){
9                    t[i][j] = 0;
10                }
11            }
12        }
13        for(int i =1;i<=m;i++){
14            for(int j =1;j<=n;j++){
15                if(str1.charAt(i-1) == str2.charAt(j-1)){
16                    t[i][j]= 1+ t[i-1][j-1];
17                }else{
18                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
19                }
20            }
21        }
22        StringBuilder ans = new StringBuilder();
23
24int i = m;
25int j = n;
26
27while (i > 0 && j > 0) {
28    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
29        ans.append(str1.charAt(i - 1));
30        i--;
31        j--;
32    } else if (t[i - 1][j] > t[i][j - 1]) {
33        ans.append(str1.charAt(i - 1));
34        i--;
35    } else {
36        ans.append(str2.charAt(j - 1));
37        j--;
38    }
39}
40
41while (i > 0) {
42    ans.append(str1.charAt(i - 1));
43    i--;
44}
45
46while (j > 0) {
47    ans.append(str2.charAt(j - 1));
48    j--;
49}
50
51return ans.reverse().toString();
52    }
53}