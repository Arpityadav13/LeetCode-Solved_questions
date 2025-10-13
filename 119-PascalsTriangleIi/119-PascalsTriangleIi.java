// Last updated: 10/13/2025, 11:31:52 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1); // row 0

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1); // first element

            // fill in the middle elements
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1); // last element
            prev = curr;
        }

        return prev;
    }
}
