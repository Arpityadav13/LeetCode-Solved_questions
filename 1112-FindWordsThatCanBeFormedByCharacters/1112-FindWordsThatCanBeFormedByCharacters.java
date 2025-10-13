// Last updated: 10/13/2025, 11:30:27 PM
class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        // Count frequency of each character in `chars`
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check each word
        for (String w : words) {
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean canForm = true;

            for (char c : w.toCharArray()) {
                if (!temp.containsKey(c) || temp.get(c) == 0) {
                    canForm = false;
                    break;
                }
                temp.put(c, temp.get(c) - 1);
            }

            if (canForm) {
                ans += w.length();
            }
        }

        return ans;
    }
}
