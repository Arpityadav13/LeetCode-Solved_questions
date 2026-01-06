// Last updated: 1/6/2026, 9:15:05 AM
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        Stack<Integer> st =new Stack<>();
4        List<String> list =new ArrayList<>();
5        int j = 0; 
6        for(int i =0;i<target.length;i++){
7            while(j<n){
8                st.push(j+1);
9                list.add("Push");
10                j++;
11                if(target[i]!=st.peek()){
12                    st.pop();
13                    list.add("Pop");
14                }else{
15                    break;
16                }
17            }
18
19        }
20        return list;
21    }
22}