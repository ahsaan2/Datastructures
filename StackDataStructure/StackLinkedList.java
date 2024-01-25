package StackDataStructure;

class StackUnderFlowException extends Exception {
    // constructor for the stackUnderFlowException
    public StackUnderFlowException() {
        super("StackIsEmpty:");
    }

    public StackUnderFlowException(String message) {
        super(message);
    }
}

public class StackLinkedList {
    // we do not need the tail

    // implementation of the dynamic stack using linked list
    /**
     * Begining of the stack to be preferred as top of the stack-->> why do add or
     * remove the elements at the head
     * -->> because adding and removing the elements at the head is in the Order(1).
     * We use the linked list when the size of the stack is not known in advance-->
     * in LL there is not limitations
     * on the number of nodes we create.
     * Push()--> this must function in the similar fashion as how we add the node in
     * the linked list
     * pop()-->> should be like we remove the node in the linked list
     * 
     * <<-->> Structure of the node in the stack is same as that of the linked list,
     * as we represent stack
     * in the form of linked list.
     * <<-->> To implement the stack using the linked list , each time we try to put
     * the elements in the stack
     * we add the nodes in the linked list at head, once the node is added at head
     * and want to add some more,
     * the new node is made the head each time.
     * Thus adding nodes and removing nodes happen only and only at head.
     * 
     * 
     */
    /**
     * Node
     */
    // we will have only a head node
    Node head;
    // size
    private int size = 0;

    // create a class node that will have the integer value and node next
    class Node {
        int value;
        Node next;

        // create a constructor for the value
        public Node(int value) {
            this.value = value;
        }

        // create a constructor for the value and next
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    // so how do we add push the nodes
    // create a push method
    void push(int x) {
        // there might be the chances where head can be the null
        // create a node that will take the value and make that node as head
        Node node = new Node(x);
        if (head == null) {
            head = node;
        }
        // If we have a head earlier present then we need to add the next of the node to
        // head
        // and update the node as head

        else {
            node.next = head;
            head = node;

            // return node.value;
        }
        size++;

    }

    // pop method should be of the int return type
    int pop() throws StackUnderFlowException { // if the stack is empty then it will throw an exception
        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is empty:");
            // a custom exception message will be displayed
        }

        // we have to remove or pop the elements at the head of the linked list
        // store the head of the linked list in some variable and then return that
        int number = head.value;
        head = head.next;
        return number;
    }

    boolean isEmpty() { // if the head is null, no item is present
        return head == null;
    }
}
