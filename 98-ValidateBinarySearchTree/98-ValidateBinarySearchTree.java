// Last updated: 4/11/2026, 12:47:08 AM
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
21            System.out.print(l.get(i)+" ");
22            if(l.get(i)<=l.get(i-1)){
23                return false;
24            }
25
26        }
27        return true;
28    }
29    private void inorder(TreeNode root){
30        if(root == null){
31            return;
32        }
33        
34        inorder(root.left);
35        l.add(root.val);
36        inorder(root.right);
37    }
38}