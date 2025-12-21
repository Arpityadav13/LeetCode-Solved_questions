// Last updated: 12/21/2025, 10:52:15 PM
1class Solution {
2    public long maximumHappinessSum(int[] happiness, int k) {
3        Arrays.sort(happiness);
4        long output = 0;
5        int i = happiness.length-1;
6        int n =0;
7        while(n<k && i>=0){
8            int a =happiness[i]-n;
9            if(a<=0){ break;}
10            else{output+=a;
11            n++;
12            i--;}
13        }
14        return output;
15    }
16}