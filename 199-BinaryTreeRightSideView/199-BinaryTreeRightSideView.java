// Last updated: 4/10/2026, 10:39:41 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        if(root == null){
19            return new ArrayList<>();
20        }
21        Queue<TreeNode> q = new LinkedList<>();
22        List<Integer> l = new ArrayList<>();
23        q.offer(root);
24        while(!q.isEmpty()){
25            int n =q.size();
26            TreeNode k= null;
27            while(n-->0){
28                k =q.poll();
29                
30                if(k.left != null){
31                    q.add(k.left);
32                }
33                if(k.right != null){
34                    q.add(k.right);
35                }
36            }
37            l.add(k.val);
38
39        }
40        return l;
41    }
42}