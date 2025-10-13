// Last updated: 10/13/2025, 11:31:54 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i<numRows; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j =0 ;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);

                }else{
                int n =result.get(i-1).get(j)+ result.get(i-1).get(j-1);
                row.add(n);
            }

            }
            result.add(row);
        }
        return result;
    }
}