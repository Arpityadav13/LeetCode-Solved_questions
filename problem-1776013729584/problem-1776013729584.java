// Last updated: 4/12/2026, 10:38:49 PM
1class Solution {
2    public String trafficSignal(int timer) {
3        if(timer==0) return "Green";
4        else if(timer==30) return "Orange";
5        else if(timer>30 && timer<90 ) return "Red";
6        else if(timer == 90) return "Red";
7        else{
8            return "Invalid";
9        }
10        
11        
12    }
13}