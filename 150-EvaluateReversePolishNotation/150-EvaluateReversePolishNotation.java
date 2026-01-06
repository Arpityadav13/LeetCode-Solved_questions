// Last updated: 1/6/2026, 9:18:47 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> s = new Stack<>();
4        int ans = 0;
5        for(int i = 0 ; i< tokens.length;i++){
6            if(tokens[i].equals("+")){
7                s.push(s.pop()+s.pop());
8                }
9            else if(tokens[i].equals("-")){
10                int minus =  s.pop();
11                s.push(s.pop()-minus);
12            }else if(tokens[i].equals("*")){
13                s.push(s.pop()*s.pop());
14            }else if(tokens[i].equals("/")){
15                int minus =  s.pop();
16                s.push(s.pop()/minus);
17            }else{
18                s.push(Integer.valueOf(tokens[i]));
19            }
20            
21        }
22        return s.peek();
23    }
24}