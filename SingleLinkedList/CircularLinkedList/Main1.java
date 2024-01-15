package SingleLinkedList.CircularLinkedList;

public class Main1 {
    public static void main(String[] args) {
        Circular list = new Circular();
        list.insert(12);
        list.insert(13);
        list.insert(23);
        list.insert(34);
        // list.deleteHead(12);

        // list.insertTail(50);
        // list.display();
        list.insertAtEnd(21);
        list.display();



    }
}
