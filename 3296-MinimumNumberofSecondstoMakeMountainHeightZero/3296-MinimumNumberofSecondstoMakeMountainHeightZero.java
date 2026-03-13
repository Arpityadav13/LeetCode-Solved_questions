// Last updated: 3/13/2026, 11:09:22 PM
1class Solution {
2    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
3
4        int maxelement = 0;
5        for(int num : workerTimes)
6            maxelement = Math.max(maxelement, num);
7
8        long start = 1;
9        long end = (long) maxelement * mountainHeight * (mountainHeight + 1) / 2;
10
11        long result = end;
12
13        while(start <= end){
14
15            long mid = start + (end - start) / 2;
16
17            if(check(mid, mountainHeight, workerTimes)){
18                result = mid;
19                end = mid - 1;
20            } 
21            else{
22                start = mid + 1;
23            }
24        }
25
26        return result;
27    }
28
29    public boolean check(long mid , int mountainHeight , int[] workerTimes){
30
31        long h = 0;
32
33        for(int t : workerTimes){
34
35            long k = (long)((Math.sqrt(1 + 8.0 * mid / t) - 1) / 2);
36
37            h += k;
38
39            if(h >= mountainHeight)
40                return true;
41        }
42
43        return false;
44    }
45}