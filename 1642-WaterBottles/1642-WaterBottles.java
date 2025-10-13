// Last updated: 10/13/2025, 11:30:15 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottles=empty/numExchange;
            empty=empty%numExchange+newBottles;
            total+=newBottles;
        }
        return total;
        
    }
}