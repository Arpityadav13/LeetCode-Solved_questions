// Last updated: 4/9/2026, 11:00:22 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    ArrayList<Integer> list = new ArrayList<>();
18    public int getMinimumDifference(TreeNode root) {
19        difference(root);
20        int minDiff = Integer.MAX_VALUE;
21
22        for (int i = 1; i < list.size(); i++) {
23            int diff = list.get(i) - list.get(i - 1);
24            minDiff = Math.min(minDiff, diff);
25        }
26
27        return minDiff;
28    }
29    private void difference(TreeNode root) {
30        if(root==null){
31            return;
32        }
33        difference(root.left);
34        list.add(root.val);
35        difference(root.right);
36
37            }
38    
39}