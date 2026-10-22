/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;

        if (pointer == null) return null;
        
        ListNode node = new ListNode(head.val);
        ListNode newHead = node;

        while (pointer != null) {

            if (node.val != pointer.val) {
                ListNode newNode = new ListNode(pointer.val);
                node.next = newNode;
                node = newNode;
            }

            pointer = pointer.next;
        }

        return newHead;
    }
}