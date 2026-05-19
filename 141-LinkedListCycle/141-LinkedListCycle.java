// Last updated: 5/20/2026, 12:36:05 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        HashSet<ListNode> set = new HashSet<>();
15        while(head != null){
16            if(set.contains(head)) return true;
17            set.add(head);
18            head = head.next;
19        }
20        return false;
21    }
22}