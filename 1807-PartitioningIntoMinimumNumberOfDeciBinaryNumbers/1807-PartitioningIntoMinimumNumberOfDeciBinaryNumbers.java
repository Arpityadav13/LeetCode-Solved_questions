// Last updated: 10/13/2025, 11:30:10 PM
class Solution {
    public int minPartitions(String n) {
        int ans=Integer.MIN_VALUE;
        for(char num : n.toCharArray()){
             int digit = num - '0';
            ans=Math.max(ans,digit);
        }
        return ans;
    }
}