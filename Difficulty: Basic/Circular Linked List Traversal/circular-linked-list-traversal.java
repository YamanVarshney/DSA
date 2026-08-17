class Solution {
    public void printList(Node head) {
        if (head == null) {
            return;
        }
        
        System.out.print(head.data+ " ");
        Node temp = head.next;
        while(temp!=head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // Node temp = head;
    
        // while (temp.next != head) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
    
        // System.out.print(temp.data + " ");
    }
}