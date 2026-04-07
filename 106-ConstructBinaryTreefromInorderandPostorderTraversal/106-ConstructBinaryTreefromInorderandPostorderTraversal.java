// Last updated: 4/7/2026, 2:54:37 PM
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
17    int index;
18    public TreeNode buildTree(int[] inorder, int[] postorder) {
19        index =postorder.length-1;
20        return helper(inorder,postorder,0,inorder.length-1);
21    }
22    private TreeNode helper(int[] inorder, int[] postorder,int left,int right){
23        if(left>right) return null;
24        int rootval = postorder[index--];
25        TreeNode  root = new TreeNode(rootval);
26        int idx = search(inorder, rootval, left, right);
27        root.right = helper(inorder,postorder,idx+1,right);
28        root.left = helper(inorder,postorder,left,idx-1);
29
30        return root;
31
32
33    }
34    private int search(int[] inorder, int rootval ,int left,int right){
35        for(int i= left ;i<=right;i++){
36            if(inorder[i]==rootval){
37                return i;
38            }
39        }
40        return -1;
41    }
42}