// Last updated: 4/2/2026, 11:11:07 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19        preorder(root,res);
20        return res;
21
22        
23    }
24    private void preorder(TreeNode root, List<Integer> res){
25        if(root == null){
26            return ;
27        }
28        res.add(root.val);
29        preorder(root.left,res);
30        
31        preorder(root.right,res);
32    }
33}