// Last updated: 10/13/2025, 11:31:09 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);}
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null){
            bucket[freq]= new ArrayList<>();
        }
        bucket[freq].add(key);
        }
        int[] arr = new int[k];
        int counter = 0;
        for(int pos = bucket.length-1;pos >= 0 && counter<k ;pos--){
            if(bucket[pos] != null){
                for(Integer i : bucket[pos]){
                arr[counter++] = i;}

            }

        }
        
        return arr;
        }
        
    }
