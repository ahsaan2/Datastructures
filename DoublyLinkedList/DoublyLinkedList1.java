package DoublyLinkedList;

public class DoublyLinkedList1 {
    /**
     * 
     * 
     */
    Node head;
    Node tail;
    private int size = 0;

    public class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public int size() {
            return size;
        }

    }

    // insert the element at the index
    public void insertAtIndex(int value, int index) {
        if (index < 0 || index > size) {
            return;
        }
        Node node = new Node(value);
        Node current = head;
        Node previous = head;
        int i = 0;
        while (i < index && current != null) {
            previous = current;
            current = current.next;
            i++;
        }
        Node afterPrevious = previous.next;
        previous.next = node;
        node.prev = previous;
        node.next = afterPrevious;
        // afterPrevious.prev = node;

        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    // insert the nodes in a linked list
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null && tail == null) {
            head = tail = node;
            size += 1;
            return;
        }
        // now what if the nodes are already present then
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
        size += 1;

    }

    // add the elements at the starting index in the double linked list
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.prev = null;
        node.next = head;
        // here we have to check , head may be null if we are inserting for the very
        // first time
        // hence head.prev might give error
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size += 1;

    }

    // Now insert at the tail
    public void insertAtTail(int value) {
        // suppose if the tail is not given
        // we have to reach till the the end to find the tail
        Node node = new Node(value);
        // if head == null then
        if (head == null) {
            node.prev = null;
            node = head;
            return;
        }

        Node current = head;
        Node previous = head;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = node;
        node.prev = previous;
        node.next = null;
        size++;
    }

    // remove at first
    public void removeHead(int value) {
        if (head == null) {
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;

    }

    // remove tail
    public void removeTail(int value) {
        if (tail == null) {
            return;
        }
        Node current = head;
        Node previous = head;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        current.prev = previous;
        size--;
    }
    // remove at index
    // 1<----2     3
    // p
    //       c    

    // 1<--->3
    public void removeAtIndex(int index){
        Node previous = head;
        Node current = head;
        int i =0;
        while (i < index) {
            previous=current;
            current = current.next;
            i++;
        }
        // previous.next = previous.next.next;
        previous.next = current.next;
        current.next.prev = previous;
        current.next = null;
        current.prev= null;
    }

    // now display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End:");
    }

}
