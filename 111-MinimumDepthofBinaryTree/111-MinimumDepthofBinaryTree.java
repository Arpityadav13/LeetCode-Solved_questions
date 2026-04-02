// Last updated: 4/3/2026, 12:22:24 AM
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
17
18    public int minDepth(TreeNode root) {
19
20        if(root == null) return 0;
21
22        if(root.left == null && root.right == null)
23            return 1;
24
25        int left = Integer.MAX_VALUE;
26        int right = Integer.MAX_VALUE;
27
28        if(root.left != null)
29            left = 1 + minDepth(root.left);
30
31        if(root.right != null)
32            right = 1 + minDepth(root.right);
33
34        return Math.min(left, right);
35    }
36}