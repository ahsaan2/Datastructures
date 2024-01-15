package DoublyLinkedList;

public class main1 {
    public static void main(String[] args) {
        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.insert(10);
        list.insert(30);
        list.insert(40);  // 45  
        list.insert(40);  // 45
        list.insert(50);
        list.insert(60);

        list.display();
        // list.insertAtIndex(20, 1);
        // list.removeHead(10);
        // list.removeTail(60);
        list.removeAtIndex(2);
       
        // list.insertFirst(5);
    //    list.insertAtTail(60);
        list.display();

    }
}
