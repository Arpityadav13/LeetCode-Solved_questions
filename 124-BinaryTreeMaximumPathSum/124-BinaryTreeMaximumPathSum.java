// Last updated: 6/11/2026, 2:15:48 PM
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
17    int maxSum = Integer.MIN_VALUE;
18
19    public int maxPathSum(TreeNode root) {
20        dfs(root);
21        return maxSum;
22    }
23
24    private int dfs(TreeNode node) {
25        if (node == null) return 0;
26
27        int left = Math.max(0, dfs(node.left));
28        int right = Math.max(0, dfs(node.right));
29
30        maxSum = Math.max(maxSum, node.val + left + right);
31
32        return node.val + Math.max(left, right);
33    }
34}