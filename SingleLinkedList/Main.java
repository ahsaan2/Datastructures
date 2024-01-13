package SingleLinkedList;
public class Main {
    public static void main(String [] args){
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        CustomLinkedList<String> list1 = new CustomLinkedList<>();
        list1.insert("ab");
        list1.insert("cd");
        list1.insert("ef");
        list1.insert("gh");
        list1.display();

        list.insert(12);
        list.insert(14);
        list.insert(16);
        list.insert(26);  // 3 remove
        list.insert(30);
        list.insert(40);  // 5 remove
        list.insert(50);
        list.insert(60);
        list.insert(70);
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
        // list.insertLast(10);
        // list.removeAtHead();
        // list.removeAtHead();
        // list.removeAtTail();
        list.display();
        list.removeAtIndex(3);  //remove 26
        list.display();
        list.removeAtIndex(5);  // remove 40
        list.display();
        list.removeAtIndex(6);  // remove 50
            // 12 --> 14 --> 16 --> 30  --> 50
        
        list.display();
    }
}
