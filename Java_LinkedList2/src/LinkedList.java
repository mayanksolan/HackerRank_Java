class LinkedList {
    private static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) { data=d;}
    }
    public static void main(String[] args) {
        new LinkedList();
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        push(4);
        pushAfter(second,5);
        pushEnd(6);
        printList();
        //deleteNode(5);
        deleteInd(5);
        printList();
        System.out.println(listLen());
        System.out.println(searchKey(10));
        System.out.println(searchInd(4));
        //deleteList();
        //printList();
    }
    private static int searchInd(int ind) {
        Node temp=head;
        int count=1;
        while(temp != null && count!=ind) {
            temp=temp.next;
            count++;
        }
        return temp.data;
    }
    private static Boolean searchKey(int key) {
        Node temp=head;
        while(temp!=null) {
            if(temp.data==key) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    private static int listLen() {
        Node temp = head;
        int count=0;
        if(head == null) {
            return 0;
        } else {
            while(temp != null) {
                count++;
                temp=temp.next;
            }
        }
        return count;
    }
    private static void deleteList() {
        head = null;
    }
    private static void deleteInd(int ind) {
        Node temp = head, prev=null;
        if(ind==0 && temp!= null) {
            head = temp.next;
            return;
        }
        int count=0;
        while(count<ind && temp.next!=null) {
            prev=temp;
            temp = temp.next;
            count++;
        }
        if(count==ind) {
            prev.next = temp.next;
        }
    }
    private static void deleteNode(int key) {
        Node temp = head, prev;
        if(temp != null && temp.data == key) {
            head = temp.next;
        }
        while(temp.data != key && temp.next != null) {
            prev = temp;
            temp = temp.next;
            if(temp.data == key) {
                if(temp.next != null) {
                    prev.next = temp.next;
                } else {
                    prev.next = null;
                }
            }
        }
    }
    private static void pushEnd(int nd) {
        Node newNode = new Node(nd);
        if(head == null) {
            head = newNode;
            newNode.next = null;
            return;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    private static void pushAfter(Node prev_node, int nd) {
        if(prev_node == null) {
            System.out.println("The given node cannot be null");
            return;
        }
        Node newNode = new Node(nd);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    private static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    private static void printList() {
        Node n = head;
        System.out.print("The list is - ");
        while(n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
}
