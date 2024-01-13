package SingleLinkedList;

public class CustomLinkedList<Ttype> {
    // now in linked list we have a head at the start and the tail at the end
    Node head;
    Node tail;
    // create a size
    private int size = 0;

    // every linked list is made up of the node that contains the int value and the
    // reference to the next node
    class Node {
        Ttype value;
        Node next;

        // create a constructor for the value
        public Node(Ttype value) {
            this.value = value;
        }

        // Now we create a constructor for the value and next node --> this helps us
        // adding the element at any specific index
        public Node(Ttype value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // create a constructor for size
    public int size() {
        return size;
    }

    // insert method to add the value item in the CustomLinkedList
    public void insert(Ttype value) {
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
    public void insertLast(Ttype value) {
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
    public void insertFirst(Ttype value) {
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
    public boolean insertAtIndex(Ttype value, int index) {
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
    /**
     * remove the nodes at the first index
     * 
     * 
     */
    
    public void removeAtHead(){
        // here if the index is the head
        // 1 2 3 4 5
        // if the head is null then tail will also be null --> means we have a empty list
        if(head == null){
            tail = null;
            return;
        }
        // to remove the element at node --> we will update the current head to the next node and also we will decrease the size
        head = head.next;
        size-=1;
    }
    public void removeAtTail(){
        if (tail == null) {
            return;
        }
        // now if tail is present then we have to reach till tail
        // So, how do we reach till tail--> we use the two pointer method where both the pointers will start from
        // head and it will run till while condition becomes false
        Node prev = head;
        Node current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;

        }
        // Our previous pointer will be at what we can tail -1 and we can update the next or reference of previous as null and 
        // update previous as tail
        prev.next = null;
        tail = prev;
        size-=1;
    }
    public void removeAtIndex(int index){
        // If the index is 0 that means we have to remove at head 
        if(index == 0){
            removeAtHead();
        }
        // if the index given is the size we will remove at the tail
        // remember always decrease the size once we remove an element
        if (index == size) {
            removeAtTail();        
        }
        else{   // this executes if the index is in between head and tail
            Node prev = head;
            Node current = head;
            int i = 0;
            while(i < index){
              prev = current;
              current = current.next;
              i++;
            }
            if(prev.next!=null){
                prev .next = prev.next.next;   // our next of the previous element will point to the next of next of that previous 
                // by this way only we can remove the link between teh previous and the element at the index
                current.next = null;   // update the index of current element to null
            }
           
        }
       
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