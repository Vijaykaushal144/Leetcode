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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode fast=null;
        ListNode slow=null;
        while(temp!=null)
        {
            fast=temp.next;
            temp.next=slow;
            slow=temp;
            temp=fast;
        }
           return slow; 
    }

}