// Last updated: 10/13/2025, 11:31:01 PM
class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        boolean oddfound = false;
        HashMap<Character,Integer> map =new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }for(char k : map.keySet()){
            if(map.get(k)%2==0){
                ans+=map.get(k);

            }else {
                ans += map.get(k) - 1;
                oddfound =true;
            }
        }
        if(oddfound) ans +=1;
    return ans;
        
    }
}