package Java;

public class singleLinkedList {
    // we have a head
    private  static Node head;
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

    public void display(Node head) {
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

    // delete first node in the linked list
    // to delete the first node, we will have the second node as the head and the
    // previous of that will be null
    public Node deleteFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next; // 1 2 3 4
        // remove the link
        temp.next = null;
        return temp;

    }

    // delete the last node in the linked list.
    // 1 2 3 4 5 6
    public Node deleteLast() {
        if (head == null) {
            return null;
        }
        // we have to traverse till the end of the linked list
        Node previous = head;
        Node current = head;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        // we are at the last node, since we have to remove this only, we need to have
        // the information
        // of the previous node we have 1 --> 2 --> 3 --> 4 --> 5
        // p c
        previous.next = null;
        return current;

    }

    // delete a node from the single linked list at a given index
    public Node deleteAtIndex(int index) {
        if (index == 0) {
            return null;
        }
        // 1 2 3 4 5
        // now what do we do, suppode we have to delete the node at index 2
        // so, we need to have the information about the node previous to the index
        // node,
        // and also about the node that is after the index node.
        Node current = head;
        Node previous = head;
        int i = 0;
        while (i < index && current.next != null) {
            previous = current;
            current = current.next;
            i++;
        }
        // now, here our next of the previous node will now point to the next of the
        // current node
        previous.next = current.next;
        return current;

    }

    // how to search an element in java, if the item is found then return true, else
    // return false
    public boolean searchNode(int key) {
        // traverse the linked list
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    // reverse a singly-linkedList
    public  Node reverse(Node head) {
        // 3-->4-->5-->6
        // 3 <--4<--5<--6
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            
            next = current.next;
            current.next = previous;
            previous = current;
            // also our current will be the next
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        singleLinkedList ll = new singleLinkedList();
        // initially the head is null
        singleLinkedList.head = new Node(10); // we have a head of value 10
        // create another node
        Node second = new Node(12);
        Node third = new Node(15);
        Node fourth = new Node(20);
        singleLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        // display the items
        ll.display(head);
        // length of the linked list
        int length = ll.lengthOfLinkedList();
        System.out.println("The original size of the linked list:" + length);
        ll.insert(9);
        ll.insert(8);
        ll.insert(7);
        // 7 -> 8 -> 9
        ll.display(head);
        System.out.println("Nodes after adding at the tail:");
        ll.insertLast(30);
        ll.insertLast(40);
        ll.insertLast(50);
        ll.display(head);
        System.out.println("Insert a node at the given index:");
        ll.insertAtIndex(11, 4);
        ll.display(head);
        // delete the first node/head, since we are returning, we have to return the
        // data of the node.
        System.out.println(ll.deleteFirst().data); // 7
        ll.display(head);
        System.out.println(ll.deleteFirst().data); // 7
        ll.display(head);
        System.out.println(ll.deleteLast().data);
        ll.display(head);
        System.out.println(ll.deleteAtIndex(3).data); // 12
        ll.display(head);
        System.out.println("The node value is present or not:" + ll.searchNode(15));
        Node reverseFromHead = ll.reverse(head);
        ll.display(reverseFromHead);
    }
}
