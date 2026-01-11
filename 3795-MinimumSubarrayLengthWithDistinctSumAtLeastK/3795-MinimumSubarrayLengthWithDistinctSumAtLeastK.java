// Last updated: 1/11/2026, 11:51:04 PM
1class Solution {
2    public int minLength(int[] nums, int k) {
3        int length=Integer.MAX_VALUE,left=0,sum=0,currLength=0;
4        HashMap<Integer,Integer>map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7            if(map.get(nums[i])==1) sum+=nums[i];
8            currLength++;
9            while(sum>=k){
10                length=Math.min(length,currLength);
11                map.put(nums[left],map.get(nums[left])-1);
12                if(map.get(nums[left])==0){
13                    map.remove(nums[left]);
14                    sum-=nums[left];
15                }
16                currLength--;
17                left++;
18            }
19        }
20        if(length==Integer.MAX_VALUE) return -1;
21        return length;
22    }
23}