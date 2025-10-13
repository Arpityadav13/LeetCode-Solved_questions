// Last updated: 10/13/2025, 11:31:47 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i = 0 ; i< tokens.length;i++){
            if(tokens[i].equals("+")){
                s.push(s.pop()+s.pop());
                }
            else if(tokens[i].equals("-")){
                int minus =  s.pop();
                s.push(s.pop()-minus);
            }else if(tokens[i].equals("*")){
                s.push(s.pop()*s.pop());
            }else if(tokens[i].equals("/")){
                int minus =  s.pop();
                s.push(s.pop()/minus);
            }else{
                s.push(Integer.valueOf(tokens[i]));
            }
            
        }
        return s.peek();
    }
}