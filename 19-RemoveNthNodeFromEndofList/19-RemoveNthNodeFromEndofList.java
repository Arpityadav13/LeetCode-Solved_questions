// Last updated: 3/8/2026, 9:01:29 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13         int count = 0;
14
15        ListNode temp = head;
16
17        while(temp != null){
18            count++;
19            temp = temp.next;
20        }
21        int deleteNode = (count -n)+1;
22         if(deleteNode == 1){
23            return head.next;
24        }
25        ListNode temp2 =head;
26        for(int i = 1; i < deleteNode - 1; i++){
27            temp2 = temp2.next;
28        }
29
30        temp2.next = temp2.next.next;
31
32        return head;
33    }
34}