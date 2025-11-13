// Last updated: 11/13/2025, 6:25:18 PM
class Solution {
    public int minimumSum(int num) {
       
        int[] out = new int[2];
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        String result = "" + digits[0] + digits[2];
        String result1 = "" + digits[1] + digits[3];
        int sorted = Integer.parseInt(new String(result));
        int sorted1 = Integer.parseInt(new String(result1));
        return (sorted+sorted1);

        
    }           
}