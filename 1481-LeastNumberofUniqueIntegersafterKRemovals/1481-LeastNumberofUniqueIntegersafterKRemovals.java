// Last updated: 12/28/2025, 9:35:28 AM
1class Solution {
2    public int findLeastNumOfUniqueInts(int[] arr, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        
5        for(int num : arr){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8        List<Integer> freq = new ArrayList<>(map.values());
9        Collections.sort(freq);
10        int uni =freq.size();
11        for(int f : freq){
12            if(k>=f){
13                k-=f;
14                uni--;
15
16            }else{
17                break;
18            }
19        }
20        
21        return uni;
22    }
23}