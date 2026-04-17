// Last updated: 4/17/2026, 11:42:50 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    List<Integer> list = new ArrayList<>();
22    public List<Integer> postorder(Node root) {
23        solve(root);
24        return list;
25    }
26    private void solve(Node root){
27        if(root==null) return;
28        if(root.children != null){
29            for(Node node : root.children){
30                solve(node);
31            }
32        }
33        list.add(root.val);
34    }
35}