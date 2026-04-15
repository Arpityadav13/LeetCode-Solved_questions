// Last updated: 4/15/2026, 3:01:27 PM
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
18
19    public int sumNumbers(TreeNode root) {
20        return solve(root,0);
21
22    }
23    private int solve(TreeNode root, int curr){
24        if(root==null){
25            return 0;
26        }
27        curr = curr * 10 + root.val;
28        if(root.left == null && root.right == null){
29            return curr;
30        }
31        return solve(root.left,curr)+solve(root.right,curr);
32        
33    }
34}