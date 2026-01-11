// Last updated: 1/12/2026, 12:13:01 AM
1class Solution {
2    public int maxCount(int[] banned, int n, int maxSum) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int k : banned){
5            set.add(k);
6        }
7        int count =0;
8        int sum = 0;
9        for(int i=  1; i<=n;i++){
10            if(set.contains(i)) continue;
11            sum+=i;
12            if(sum>maxSum){
13                break;
14            }
15            count++;
16        }
17        return count;
18    }
19}