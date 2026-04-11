// Last updated: 4/11/2026, 9:24:01 PM
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
17    int sum = 0;
18    public int rangeSumBST(TreeNode root, int low, int high) {
19        inorder(root,low,high);
20        return sum;
21    }
22    private void inorder(TreeNode root, int low, int high) {
23        if(root == null){
24            return;
25        }
26        inorder(root.left,low,high);
27        if(root.val<=high && root.val>=low){
28            sum +=root.val;
29        }
30        inorder(root.right,low,high);
31        }
32}