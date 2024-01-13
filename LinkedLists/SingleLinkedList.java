
package LinkedLists;

class LinkedListNode {
    int value;
    LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}

/**
 * SingleLinkedList
 */
public class SingleLinkedList {
    LinkedListNode tail; // points to the last element in the linkedList 
    LinkedListNode head; // points to the first node in the linkedlist;

    public void add(int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (this.tail == null || this.head == null) {
            this.tail = node;
            this.head = node; // this is wrong
        } else {
            tail.next = node;
            this.tail = tail.next; // we update tail to point to the new element added in the linkedlist
        }
    }

    public void print(){
        LinkedListNode tempHead = head;
        while(tempHead != null){
            System.out.println(tempHead.value);
            tempHead = tempHead.next;
        }
    }
}
