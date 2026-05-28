/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null){
            return null;
        }

        Node curr=head;
        while(curr!=null){
            Node copy=new Node(curr.val);
            Node temp=curr.next;
            curr.next=copy;
            copy.next=temp;
            curr=temp;
        }

        curr=head;
        while(curr!=null){
            if(curr.next!=null && curr.random!=null){
            curr.next.random=curr.random.next;

            }
            curr=curr.next.next;
        }

        Node newHead=head.next;

        curr=head;
        while(curr!=null){
            Node tmp=curr.next;
            curr.next=tmp.next;
            if(tmp.next!=null){
                tmp.next=tmp.next.next;
            }

            curr=curr.next;

        }
        return newHead;
        
    }
}
