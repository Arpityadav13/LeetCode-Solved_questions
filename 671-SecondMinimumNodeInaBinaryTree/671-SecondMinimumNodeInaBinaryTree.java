// Last updated: 4/18/2026, 10:00:33 PM
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
17    Set<Integer> set = new HashSet<>();
18    public int findSecondMinimumValue(TreeNode root) {
19        inorder(root);
20        if(set.size()<2) return -1;
21        Queue<Integer> q = new PriorityQueue<>();
22        for(int k : set){
23            q.add(k);
24        }
25        q.poll();
26        return q.poll();
27    }
28    private void inorder(TreeNode root){
29        if(root == null){
30            return ;
31        }
32        set.add(root.val);
33        inorder(root.left);
34        inorder(root.right);
35    }
36}