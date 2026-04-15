// Last updated: 4/15/2026, 11:13:17 AM
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
17    int result = 0;
18    public int findTilt(TreeNode root) {
19        solve(root);
20        return result;
21    }
22    private int solve(TreeNode root){
23        if(root==null) return 0;
24        int left = solve(root.left);
25        int right = solve(root.right);
26        result += Math.abs(left-right);
27        return left+right+root.val;
28    }
29}