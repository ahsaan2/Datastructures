
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
    private int size = 0;

    public boolean add(int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (this.tail == null || this.head == null) {
            this.tail = node;
            this.head = node; // this is wrong
        } else {
            tail.next = node;
            this.tail = tail.next; // we update tail to point to the new element added in the linkedlist
        }
        size += 1;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
    


    public boolean contains(int value) {    // we have to traverse the linked list to find out if the value we are looking for is present or not
        
        LinkedListNode tempHead = head;
        while (tempHead != null) {
            if (tempHead.value == value)
                return true;
                // 5 -- 7 -- 9 -- 10
            tempHead = tempHead.next;
        }
        return false;
    }

    public boolean remove(int value){
        // remove the node having value equals to value;
        if(this.head == null){
            return false;
        }
        
            // If head and tail points to the same element that is we have only one element in the linkedList
        if(this.head == this.tail && this.head.value == value){
            // once we remove the head --> tail also becomes null
            // we are having only single element in linkedList;
            this.head = null;
            this.tail = null;
            size -= 1;
            return true;
        }
        // if head.value == value
        if(this.head.value == value){
            // we have to remove head;
            this.head = this.head.next;
            size -= 1;
            return true;
        }

        LinkedListNode tempHead = head;
        LinkedListNode prev = head;
        while(tempHead != null){
            if(tempHead.value == value){
                if(tempHead.next == null){
                    // we are at tail;
                    prev.next = null;
                    this.tail = prev;
                    size -= 1;
                    return true;
                }
                // If we are removing in middle.
                // we found it.
                tempHead.next = null;
                prev.next = tempHead.next.next;
                size -= 1;
                return true;
            }
            prev = tempHead;
            tempHead = tempHead.next;
        }
        return false;
    }

    public void print() {
        LinkedListNode tempHead = head;
        while (tempHead != null) {
            System.out.println(tempHead.value);
            tempHead = tempHead.next;
        }
    }
}
