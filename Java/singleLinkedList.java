package Java;

public class singleLinkedList {
    // we have a head
    private Node head;
    private Node tail;
    // private int size;

    int size(int size) {
        return size;
    }

    public static class Node {
        // a node has a data and a next
        private int data;
        private Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
        }
    }
    // to display the nodes in the linked list we need to travel each and every node
    // one by one

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // how do we find the length of the single linked list
    public int lengthOfLinkedList() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count += 1;
            current = current.next;
        }
        return count;
    }

    // insert a node at the start or at the begining of the linkedlist
    public void insert(int value) {
        // if we do not have any item in the linked list then
        Node node = new Node(value);

        if (head == null) {
            // create the node and point that node as both head and tail
            head = tail = node;
            // size += 1;
            // tail.next = null; // so that there will be no loop when we have only one item

        }
        // if we have the node present already then
        node.next = head;
        // that node will be our head
        head = node;
    }

    // insert the node at the end of the linked list
    // case1 : if we do not have any node present
    public void insertLast(int value) {
        if (head == null) {
            insert(value);
        }
        // now if the nodes are present , we have to traverse till the end of the linled
        // list
        // first we have to reach till the end of the linked list
        Node currNode = head;
        while (currNode.next != null) {
            // keep moving till the end
            currNode = currNode.next;
        }
        // now we are out of the loop and we have reached till the end of the linked
        // list
        // create and add the new node
        Node node = new Node(value);
        currNode.next = node;
        node.next = null;

    }

    // insert a node in the linked list at a given index/position
    public void insertAtIndex(int value, int index) {
        Node current = head;
        Node previous = head;
        if (head == null) {
            insert(value);
        }
        if (tail == null) {
            insertLast(value);
        }
        // now we have to reach till the providex index, suppose the index is 4
        // we have to reach till index 3 and point the next of index 3 to new node and
        // also we need
        // to have the information of the previous node at index 4
        int i = 0;
        while (i < index && current.next != null) {
            previous = current;
            current = current.next;
            // after each iteration we have to update the i
            i++;

        }
        // here we are at the designed index
        // create a new node
        Node node = new Node(value);
        previous.next = node;
        node.next = current;

    }

    public static void main(String[] args) {
        singleLinkedList ll = new singleLinkedList();
        // initially the head is null
        ll.head = new Node(10); // we have a head of value 10
        // create another node
        Node second = new Node(12);
        Node third = new Node(15);
        Node fourth = new Node(20);
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        // display the items
        ll.display();
        // length of the linked list
        int length = ll.lengthOfLinkedList();
        System.out.println("The original size of the linked list:" + length);
        ll.insert(9);
        ll.insert(8);
        ll.insert(7);
        // 7 -> 8 -> 9
        ll.display();
        System.out.println("Nodes after adding at the tail:");
        ll.insertLast(30);
        ll.insertLast(40);
        ll.insertLast(50);
        ll.display();
        System.out.println("Insert a node at the given index:");
        ll.insertAtIndex(11, 4);

        ll.display();
    }
}
