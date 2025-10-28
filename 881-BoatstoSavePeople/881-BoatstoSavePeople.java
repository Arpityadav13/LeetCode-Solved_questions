// Last updated: 10/28/2025, 11:23:36 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat= 0,space=0;
        int left = 0,right=people.length-1;
        while(left<=right){
            if(people[right]==limit){
                boat++;
                right--;
            }else if(people[left]+people[right]<=limit){
                left++;
                right--;
                boat++;
                
                }else{
                    right--;
                    boat++;
                }
                

            }
        return boat;
        }
        
    }
