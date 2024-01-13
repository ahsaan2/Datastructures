
public class Main {
    public static void main(String [] args){
        CustomLinkedList list = new CustomLinkedList();
        // list.insert(12);
        // list.insert(14);
        // list.insert(16);
        // list.insert(26);
        // // 12 --> 14--> 16--> 26
        // list.display();
        // System.out.println();
        // list.insertLast(40);
        // list.insertLast(50);
        // // 12 --> 14--> 16--> 26 --> 40 --> 50
        // list.display();
        // list.insertFirst(10);
        // list.insertFirst(5);
        // list.insertFirst(1);
        // // 1 --> 5 --> 10 --> 12 --> 14 --> 16 --> 26 --> 40 --> 50 --> null
        // System.out.println();
        // // add at index 6
        // list.insertAtIndex(22, 6);
        // // 16--> 22 --. 26
        // list.display();
        // list.insertAtIndex(-1, 12);
        list.insertLast(10);
        list.display();
    }
}
