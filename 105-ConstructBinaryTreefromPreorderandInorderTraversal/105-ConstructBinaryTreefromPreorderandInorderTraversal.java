// Last updated: 4/6/2026, 11:40:48 PM
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
17    int preindex = 0;
18    public TreeNode buildTree(int[] preorder, int[] inorder) {
19            return helper(preorder,inorder,0,inorder.length-1);
20
21    }
22    private TreeNode helper(int[] preorder, int[] inorder,int left , int right){
23        if(left>right) return null;
24        int rootval = preorder[preindex++];
25        TreeNode  root = new TreeNode(rootval);
26        int idx = search(inorder, left, right, rootval);
27        root.left = helper(preorder,inorder,left,idx-1);
28        root.right = helper(preorder,inorder,idx+1,right);
29
30        return root;
31
32    }
33    private int search(int[] inorder, int left, int right, int target){
34        for(int i =left;i<=right;i++){
35            if(inorder[i]==target){
36                return i;
37            }
38        }
39        return -1;
40    }
41}