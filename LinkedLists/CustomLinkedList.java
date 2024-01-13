package LinkedLists;

public class CustomLinkedList {
    // we are going to create a custom linked list
    // each linked list contains a value of type int and a reference to the next element
    // also each linked list contains a head and a tail
    // create a class node
    Node head;
    Node tail;
    private int size = 0;

    class Node {
        int value;
        Node next; // reference to the next linked list element
        // create a constructor of the class

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) { // this will help us in inserting a element at a given index
            this.value = value;
            this.next = next;
        }

    }

    public int size() {
        return size;
    }

    private void insertAtTail(Node node){
        tail.next = node;
        tail = node;
        size += 1;
    }
    
    private void insertAtHead(Node node){
        // adds the element at the head
        node.next = head;
        head = node;
        // if we have tail as null, tail will point to the head
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    private void insertAtIndex(Node node, int index){
        // here we have to keep the track of the nodes 
        Node current = head;
        Node prev = head;
        int i = 0;
        while(i < index && current != null){
            prev = current;
            current = current.next;
            i++;
        }
        size += 1;
        node.next = current;
        prev.next = node;
    }

    public void insertAtIndex(int value, int index) throws Exception {
            // If the index we want to add our element is less then 0 or greater than the size of the linked list then it will throw an exception
        if(index < 0 || index > size){
            throw new Exception("Index should be greater than 0 and less than "+size);
        }
        Node node = new Node(value);
        // if we want t add at the head
        if(index == 0){
            this.insertAtHead(node);
            return;
        }
        // if we want to add at the size of the linked list, we do insertion at the tail
        if(size == index){
            this.insertAtTail(node);
            return;
        }
        this.insertAtIndex(node, index);
    }

    // now how do we add the elements at the lastindex
    public void insertLast(int value) {
        Node node = new Node(value);
        // now tail will point to the new node that we just created
        tail.next = node;
        // also we need to update the tail
        tail = node;
        size += 1;
    }

    // add the elements at the first
    // so how do we add the elements at the first--> let us assume that we have some
    // elements in the linked list
    public void insert(int value) {  
        // we first create a new node
        /**
         * If we want to add a node in the custom linked list and we dont have any node present that is our head and tail is null
         */
        Node node = new Node(value); // 12 -> Null, head -> 12
        // create a new node and it will point to the head and also tail
        if(head == null && tail == null){
            head = tail = node;
            size += 1;
            return;
        }
        // Now if we have already a node present and then we update it from the tail node
        tail.next = node;
        tail = tail.next;   // update the tail
        size += 1;
    }

    // now create a function to display the nodes that we added
    public void display() {
        // we create a temp node that points to the head and we keep updating that temp
        // WHy do we need a temp--> Because if we try to move the head node the entire structure of the linked list will change
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End:");
    }
}