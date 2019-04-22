// Java program to implement
// the above approach
class GFG
{

    // node
    static class Node
    {
        int data;
        Node next;
    }
    /* Function to insert a node at the beginning of a Circular linked list */
    static Node pushEnd(Node head_ref, int data)
    {
        Node newN = new Node();
        newN.data = data;
        newN.next = null;
        Node trav = head_ref;
        if(head_ref==null) {
            head_ref = newN;
            newN.next = head_ref;
        } else {
            while(trav.next != head_ref) {
                trav=trav.next;
            }
            trav.next = newN;
            newN.next = head_ref;
        }
        return head_ref;
    }
    /* Function to print nodes in a given Circular linked list */
    static void printList(Node head)
    {
        Node temp = head;
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(temp != head);
    }
    // Driver Code
    public static void main(String args[])
    {
        /* Initialize lists as empty */
        Node head = null;
	/* Created linked list will	be 11.2.56.12 */
        head = pushEnd(head, 12);
        head = pushEnd(head, 56);
        head = pushEnd(head, 2);
        head = pushEnd(head, 11);
        System.out.println("Contents of Circular " + "Linked List:");
        printList(head);
    }
}
