// Last updated: 10/13/2025, 11:31:56 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result= new ArrayList<>();
        
        Queue<TreeNode> q= new LinkedList<>();
        if (root == null) return new ArrayList<>();

        q.offer(root);
        
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);

            if(curr.left!=null){
                q.offer(curr.left);
            }if(curr.right!=null){
                q.offer(curr.right);
            }
                    
                
                }
                      result.add(level);}

                return result;
            
        }

        
    }
