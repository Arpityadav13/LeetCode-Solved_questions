// Last updated: 4/10/2026, 10:13:44 AM
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> dl = new ArrayList<>();
19        List<List<Integer>> list  =levelOrder(root);
20        for(int i = 0 ;i<list.size();i++){
21            long sum = 0;
22            int size =list.get(i).size();
23            for(int j = 0;j<size;j++){
24                sum += list.get(i).get(j);
25
26            }
27            Double m = sum*1.0/size;
28            dl.add(m);
29        }
30        return dl;
31    }
32    public List<List<Integer>> levelOrder(TreeNode root) {
33        List<List<Integer>> result= new ArrayList<>();
34        Queue<TreeNode> q= new LinkedList<>();
35        if (root == null) return new ArrayList<>();
36 
37        q.offer(root);
38        
39        
40        while(!q.isEmpty()){ 
41            int levelSize = q.size();
42            List<Integer> level = new ArrayList<>();
43            for (int i = 0; i < levelSize; i++) {
44                TreeNode curr = q.poll();
45                level.add(curr.val);
46            if(curr.left!=null){
47                q.offer(curr.left);
48            }if(curr.right!=null){
49                q.offer(curr.right);
50            }
51                    
52                
53                }
54                      result.add(level);}
55
56                return result;
57            
58        }
59
60}