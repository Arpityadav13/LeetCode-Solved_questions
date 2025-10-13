// Last updated: 10/13/2025, 11:30:31 PM
class Solution {
    public int fib(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        int prev1 = 1, prev2 = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
        
        

        
    }
}