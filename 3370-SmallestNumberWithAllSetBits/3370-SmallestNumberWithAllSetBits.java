// Last updated: 10/29/2025, 9:15:37 PM
class Solution {
    public int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        String p ="";
        for(int i = 0;i<binary.length();i++){
            
            p=p+'1';

        }
        int num = Integer.parseInt(p, 2);
        return num;
    }
}