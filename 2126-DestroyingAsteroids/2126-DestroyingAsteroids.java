// Last updated: 5/31/2026, 12:52:25 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        long currmass = mass;
4        Arrays.sort(asteroids);
5        for(int i : asteroids){
6            if(currmass < i){
7                return false;
8            }else {
9                currmass += i;
10            }
11        }
12        return true;
13    }
14}