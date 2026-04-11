// Last updated: 4/11/2026, 11:57:30 PM
1class Solution {
2    HashMap<Integer,Integer> map = new HashMap<>();
3
4    public int[] findMode(TreeNode root) {
5        if(root == null) return new int[]{};
6
7        inorder(root);
8
9        int maxfreq = 0;
10        for(int val : map.keySet()){
11            maxfreq = Math.max(maxfreq, map.get(val));
12        }
13
14        List<Integer> l = new ArrayList<>();
15        for(int val : map.keySet()){
16            if(map.get(val) == maxfreq){
17                l.add(val);
18            }
19        }
20        int[] arr = new int[l.size()];
21        for (int i = 0; i < l.size(); i++) {
22            arr[i] = l.get(i);
23        }
24
25        return arr;
26    }
27
28    private void inorder(TreeNode root) {
29        if(root == null) return;
30
31        inorder(root.left);
32        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
33        inorder(root.right);
34    }
35}