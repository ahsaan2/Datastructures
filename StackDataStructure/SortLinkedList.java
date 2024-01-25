package StackDataStructure;

// import java.util.Arrays;

// import java.util.Arrays;

// import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        // node1.next = new Node(3);
        // node1.next.next = new Node(4);
        // node1.next.next.next = new Node(5);

        Node node2 = new Node(2);
        node2.next = new Node(6);
        node2.next.next = new Node(8);

        Node result = merge(node1, node2); // 1->2->3->4->5->6

        Node temp = result;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        // print all nodes in result to verify.
    }

    Node head1;
    Node head2;

    static class Node {
        int value; // default 0, while creating object, if not provided.
        Node next;

        Node() {
        }

        Node(int value) {
            this.value = value;
        }
    }

    public static Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        // logic to sort list 1 and list2
        Node temp1 = head1;
        Node temp2 = head2;
        Node mix = new Node(0);
        Node p = mix;

        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                p.next = temp1;
                temp1 = temp1.next;
            } else {
                p.next = temp2;
                temp2 = temp2.next;
            }
            p = p.next;
        }

        while (temp1 != null) {
            p.next = temp1;
            temp1 = temp1.next;
            p = p.next;
        }

        while (temp2 != null) {
            p.next = temp2;
            temp2 = temp2.next;
            p = p.next;
        }
        return mix.next;  // mix has a starting or default value of 0, so when we try to return the mix
        // the first node that we have is zero--> that is why we return the values from the next of 0
        // list1 is sorted
        // list2 is sorted

        // result should be sorted of list1 and list2

    }

}
/*
 * Given
 * list1 is sorted 1->3->5
 * list2 is sorted 2->4->6
 * result 1->2->3->4->5->6
 */
