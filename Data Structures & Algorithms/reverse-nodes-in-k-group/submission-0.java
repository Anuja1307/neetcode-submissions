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
    public ListNode reverseKGroup(ListNode head, int kthNode) {
        ListNode dummy=new ListNode(0,head);
        ListNode groupPrev=dummy;

        while(true){
             ListNode k=getKthNode(groupPrev,kthNode);
             if(k==null){
                break;
             }

             ListNode groupNext=k.next;
             ListNode prev=groupNext;
             ListNode curr=groupPrev.next;

             while(curr!=groupNext){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
             }
             ListNode temp=groupPrev.next;
             groupPrev.next=k;
             groupPrev=temp;

       }
       return dummy.next;
        
    }

    public  ListNode getKthNode(ListNode curr,int k){
        while(k>0 && curr!=null){
            curr=curr.next;
            k--;
        }
        return curr;
    }
}
