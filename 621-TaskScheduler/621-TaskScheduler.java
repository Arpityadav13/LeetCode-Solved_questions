// Last updated: 1/1/2026, 11:23:37 PM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] freq =new int[26];
4        for(char c : tasks){
5            freq[c-'A']++;
6        }
7        Arrays.sort(freq);
8        int k = freq[25];
9        int gadde = k-1;
10        int space = gadde*n;
11        for (int i = 24; i >= 0 && space > 0; i--) {
12            space -= Math.min(freq[i], gadde);
13        }
14
15        return space > 0 ? tasks.length + space : tasks.length;
16    }
17}