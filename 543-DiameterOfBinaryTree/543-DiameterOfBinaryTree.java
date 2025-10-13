// Last updated: 10/13/2025, 11:30:49 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return  0;
        }
        int leftdia = diameterOfBinaryTree(root.left);
        int leftht = height(root.left);
        int rightdia = diameterOfBinaryTree(root.right);
        int rightht = height(root.right);
        int selfdia = leftht+rightht;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
}