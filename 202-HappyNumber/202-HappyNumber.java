// Last updated: 10/13/2025, 11:31:37 PM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                sum+=Math.pow(n%10,2.00);
                n=n/10;
            }
            if(sum==1) return true;
            n=sum;
            if(set.contains(n)) return false;
            set.add(n);
        }
        
        
        

        
    }
}