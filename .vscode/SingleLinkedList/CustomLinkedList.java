public class CustomLinkedList {
    // now in linked list we have a head at the start and the tail at the end
    Node head;
    Node tail;
    // create a size
    private int size = 0;

    // every linked list is made up of the node that contains the int value and the
    // reference to the next node
    class Node {
        int value;
        Node next;

        // create a constructor for the value
        public Node(int value) {
            this.value = value;
        }

        // Now we create a constructor for the value and next node --> this helps us
        // adding the element at any specific index
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // create a constructor for size
    public int size() {
        return size;
    }

    // insert method to add the value item in the CustomLinkedList
    public void insert(int value) {
        // create a new node that will point to the head as well as to the tail
        Node node = new Node(value);
        // if the head and tail are null, then our List is empty.
        // so we create a node such that head and tail will point to the node.
        if (head == null && tail == null) {
            // head and tail will both point to the node
            head = tail = node;
            size += 1;
            return;
        }
        // else  we have already head and tail present.
        // the new node will be always at the end of the linkedList 
        tail.next = node;
        // now since we have added a new node tail should be also updated
        tail = tail.next;
        size += 1;

    }

    // Now add the elements at the tail and also at the head
    public void insertLast(int value) {
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        // now tail will point to this node
        tail.next = node;
        // also this node will act as tail
        tail = node;
        size++;
    }

    // now insert the node at the head
    public void insertFirst(int value) {
        Node node = new Node(value);
        // link this node to the head
        node.next = head;
        // now this node becomes the head
        head = node;
        // check if we have tail as null then head and tail will point to node
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Now how do we add a node at a given index
    public boolean insertAtIndex(int value, int index) {
        // now here is the catch --> If the index is 0 then we add at the head and if
        // the index is size then we add at the tail
        Node node = new Node(value);
        // also we can have a condition where the index will be less than zero or
        // greater then the size
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            this.insertFirst(value);
            return true;
        }
        // now if index = size then we add at the last
        if (index == size) {
            this.insertLast(value);
            return true;
        }
        // Now if both the conditions fail then we have to add at the index that will be
        // between the head and tail
        else {
            Node current = head;
            Node previous = head;
            int i = 0;
            while (i < index && current != null) {
                current = previous;
                current = current.next;
                i++;
            }
            // once this while loop fails we have got the previous of the node and the next
            // of the node where we can add it
            previous.next = node;
            node.next = current;
            size += 1;
        }
        return true;
    }

    // now display the insert function
    public void display() {
        // here we will create a temp node that will point to the head
        Node temp = head;
        while (temp != null) {
            // we can't move the head node , because if we did it will change the structure
            // of the linked list
            System.out.print(temp.value + "-->");
            // increment the temp
            temp = temp.next;
        }
        System.out.println("null");
    }
}