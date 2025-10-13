// Last updated: 10/13/2025, 11:30:54 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
      
         
         int i=0;
        for(int j=0;i<g.length && j<s.length;j++){
          if(g[i]<=s[j]){
            i++;
            count++;
          }
        }
    return count;
     }
}