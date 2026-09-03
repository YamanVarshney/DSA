/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        // code here
        head = reverse(head);
        
        Node curr =head;
        int max = curr.data;
        
        while(curr!=null && curr.next!= null){
            if(curr.next.data< max){
                curr.next = curr.next.next;
            } else{
                curr= curr.next;
                max = curr.data;
            }
        }
        
        head= reverse(head);
        return head;
    }
    
    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
        
        return prev;
    }
}