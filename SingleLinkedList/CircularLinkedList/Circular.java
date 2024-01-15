package SingleLinkedList.CircularLinkedList;

public class Circular {
    // In circular linked list we have value and next --> But we dont have the null

    Node head;
    Node tail;
    private int size = 0;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public int size() {
        return size;
    }
    

    // Now add an node in the circular linked list
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = head = node;
            return;
        }
        // what if we have present the nodes then
        tail.next = node;
        tail = node;
        size++;
    }
    // insert at the head
    public void deleteHead(int value){    
    head = head.next;
    tail.next = head;
    size--;
    }
    // insert at the end
    public void insertAtEnd(int value){
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        tail = node;
    }
    
    // how to display
    public void display(){
        Node node = head;
        if (head!=null) {
            do{
                System.out.print(node.value+"-->");
                node=node.next;
            }
            while(node!=head);  // not runs in a circular way
        }   
        System.out.println("End:");
        
    }


}
