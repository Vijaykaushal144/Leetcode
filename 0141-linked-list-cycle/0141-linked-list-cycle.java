/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    
        if(head==null || head.next==null) return  false;
        ListNode slow= head;
        ListNode fast=head.next;
        while(slow!=fast) 
        {
            if(fast==null || fast.next==null )
            {
                return false;
            }
            slow=slow.next;
            fast= fast.next.next;
        }
        return true;
        
        
        
        
        
        
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null && fast.next!=null)
//         {
//             fast=fast.next.next;
//             slow=slow.next;
            
//             if(slow==fast) return true;
//         }
//         return false;
        
    }
}