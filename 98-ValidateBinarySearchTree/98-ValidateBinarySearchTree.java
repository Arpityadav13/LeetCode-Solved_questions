// Last updated: 4/11/2026, 12:47:24 AM
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
17    List<Integer> l = new ArrayList<>();
18    public boolean isValidBST(TreeNode root) {
19        inorder(root);
20        for(int i =  1;i<l.size();i++){
21            if(l.get(i)<=l.get(i-1)){
22                return false;
23            }
24
25        }
26        return true;
27    }
28    private void inorder(TreeNode root){
29        if(root == null){
30            return;
31        }
32        
33        inorder(root.left);
34        l.add(root.val);
35        inorder(root.right);
36    }
37}