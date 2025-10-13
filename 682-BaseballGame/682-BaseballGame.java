// Last updated: 10/13/2025, 11:30:40 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;

        for(int i = 0 ; i<operations.length;i++){
            if(operations[i].equals("C")){
                s.pop();
            }else if(operations[i].equals("D")){
                s.push(s.peek()*2);
            }else if(operations[i].equals("+")){
                int top = s.pop();
                int secondTop = s.peek();
                int curr = top + secondTop;
                s.push(top);
                s.push(curr); }
            else{s.push(Integer.parseInt(operations[i]));}


        }
        while(!s.isEmpty()){
            sum+= s.pop();
        }
        return sum;
    }
}