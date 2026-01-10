// Last updated: 1/11/2026, 12:56:20 AM
1class Solution {
2    public int maxDiff(int num) {
3        char[] arr = Integer.toString(num).toCharArray();
4        if(arr.length == 1) return 9-1;
5        char target = 0;
6        for (char c : arr) {
7            if (c != '9') {
8                target = c;
9                break;
10            }
11        }
12
13        if (target == 0) return num;
14
15        for (int i = 0; i < arr.length; i++) {
16            if (arr[i] == target) {
17                arr[i] = '9';
18            }
19        }
20        
21        char[] arr2 = Integer.toString(num).toCharArray();
22        char t = 0;
23
24            if(arr2[0]!='1'){
25                t = arr2[0];
26                for (int i = 0; i < arr2.length; i++) {
27                    if (arr2[i] == t) {
28                        arr2[i] = '1';
29                     }
30            }
31
32            }else{
33                for(int i = 1 ; i<arr2.length;i++){
34                    if (arr2[i] != '0' && arr2[i] != '1') {
35                t = arr2[i];
36                break;
37            }}
38
39        for (int i = 1; i < arr2.length; i++) {
40            
41            if (arr2[i] == t) {
42                arr2[i] = '0';
43            }
44        }
45
46            }
47        System.out.print(Integer.parseInt(new String(arr2)));
48
49        int ans= Integer.parseInt(new String(arr))-Integer.parseInt(new String(arr2));
50
51        return ans;
52    }
53}
54