// Last updated: 10/30/2025, 9:04:21 PM
class Solution {
    public int minNumberOperations(int[] target) {
        int sum = target[0];
        for(int i =1;i<target.length;i++){
            if(target[i]>target[i-1]){
                sum+=target[i]-target[i-1];
            }
        }
        return sum;
    }
}