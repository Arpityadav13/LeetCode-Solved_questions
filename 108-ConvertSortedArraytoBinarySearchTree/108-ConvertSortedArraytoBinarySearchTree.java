// Last updated: 4/15/2026, 12:24:36 AM
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
18    public TreeNode sortedArrayToBST(int[] nums) {
19        int left = 0;
20        int right = nums.length-1;
21        return solve(nums,left,right);
22        
23    }
24    private TreeNode solve(int[] nums,int left,int right) {
25        if(left>right){
26            return null;
27        }      int mid = left + (right - left) / 2;
28        TreeNode root = new TreeNode(nums[mid]);
29        root.left = solve(nums,left,mid-1);
30        root.right = solve(nums,mid+1,right);
31        return root;
32
33    }
34}