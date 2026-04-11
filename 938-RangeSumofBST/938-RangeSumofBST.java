// Last updated: 4/11/2026, 11:57:00 PM
1class Solution {
2    HashMap<Integer,Integer> map = new HashMap<>();
3
4    public int[] findMode(TreeNode root) {
5        if(root == null) return new int[]{};
6
7        inorder(root);
8
9        int maxfreq = 0;
10
11        // ✅ find max frequency
12        for(int val : map.keySet()){
13            maxfreq = Math.max(maxfreq, map.get(val));
14        }
15
16        List<Integer> l = new ArrayList<>();
17
18        // ✅ collect all values with max frequency
19        for(int val : map.keySet()){
20            if(map.get(val) == maxfreq){
21                l.add(val);
22            }
23        }
24
25        // convert to array
26        int[] arr = new int[l.size()];
27        for (int i = 0; i < l.size(); i++) {
28            arr[i] = l.get(i);
29        }
30
31        return arr;
32    }
33
34    private void inorder(TreeNode root) {
35        if(root == null) return;
36
37        inorder(root.left);
38        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
39        inorder(root.right);
40    }
41}