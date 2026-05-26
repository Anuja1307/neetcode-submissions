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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr1=list1;
        ListNode curr2=list2;

        ListNode newHead=null;

        ListNode prev=null;
        

        while(curr1!=null && curr2!=null){

            if(curr1.val==curr2.val){
                ListNode node=new ListNode(curr1.val);
                if(newHead==null){
                    newHead=node;
                }
                if(prev!=null){
                    prev.next=node;
                }
                node.next=curr2;
                prev=curr2;
                curr1=curr1.next;
                curr2=curr2.next;
                
            }
            else if(curr1.val<curr2.val){
                ListNode node= new ListNode(curr1.val);
                if(newHead==null){
                    newHead=node;
                }
                if(prev!=null){
                    prev.next=node;
                }
              
                prev=node;
                curr1=curr1.next;
            }
            else{
                ListNode node=new ListNode(curr2.val);
                if(newHead==null){
                    newHead=node;
                }
                if(prev!=null){
                    prev.next=node;
                }
                prev=node;
                curr2=curr2.next;
            }
        }

        while(curr1!=null){
            ListNode node=new ListNode(curr1.val);
            if(newHead==null){
                newHead=node;
            }
            if(prev!=null){
                prev.next=node;
            }
            prev=node;
            curr1=curr1.next;
        }
        while(curr2!=null){
            ListNode node=new ListNode(curr2.val);
            if(newHead==null){
                newHead=node;
            }
            if(prev!=null){
                prev.next=node;
            }
            prev=node;
            curr2=curr2.next;
        }
        return newHead;
        
    }
}