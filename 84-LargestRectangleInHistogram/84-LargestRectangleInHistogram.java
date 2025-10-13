// Last updated: 10/13/2025, 11:32:00 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];
        int maxarea = 0 ;
        for(int i = 0 ; i<heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
                
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        s= new Stack<>();
        for(int i = heights.length-1; i>=0 ; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
                
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        for(int i = 0; i < heights.length;i++){
            int width = nsr[i]-nsl[i] -1 ;
            int height = heights[i];
            int area = height*width;

            maxarea = Math.max(maxarea,area);
        }

        

       return maxarea; 
    }
}