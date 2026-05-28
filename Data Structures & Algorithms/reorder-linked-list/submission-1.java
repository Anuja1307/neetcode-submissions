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
    public void reorderList(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode second=slow.next;
        slow.next=null; //withut this list becomes cycle
        ListNode prev=null;
 //second is equivalent to curr used to traverse
        while(second!=null){
           ListNode temp=second.next;
           second.next=prev;
           prev=second;
           second=temp;
        }

        ListNode curr=head;
        second=prev;
        while(second!=null){
            ListNode tmp1=curr.next;
            ListNode tmp2=second.next;
            curr.next=second;
            second.next=tmp1;
            curr=tmp1;
            second=tmp2;
        }
        
    }
}
