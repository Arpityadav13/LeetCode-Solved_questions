// Last updated: 4/14/2026, 11:07:08 PM
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
17    public int sumOfLeftLeaves(TreeNode root) {
18       return solve(root,null); 
19        
20    }
21    public int solve(TreeNode curr , TreeNode parent){
22        if(curr==null){
23            return 0;
24        }
25        if(curr.left==null && curr.right ==null){
26
27            if(parent != null && parent.left == curr){
28                return curr.val;
29            }
30        }
31        int left = solve(curr.left,curr);
32        int right = solve(curr.right,curr);
33        return left + right;
34    }
35}