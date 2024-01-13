package LinkedLists;

public class Main {
    public static void main(String[] args) {
        //SingleLinkedList list = new SingleLinkedList();
        try{
                CustomLinkedList list1 = new CustomLinkedList();

                // CustomLinkedList<String> strList = new CustomLinkedList<>();
                // strList.insert("ab");
                // strList.insert("bc");
                // strList.insert("cd");
                // strList.insert("de");
                // strList.display();

                list1.insert(12); 
                list1.insert(21);
                list1.insert(22);
                //  // 22 21 12 
                // list1.insertLast(30);
                // list1.insertLast(40);
                list1.insertAtIndex(90, 0);
                list1.insert(10);
                list1.display(); // 12, 21, 22, 30 , 40
                System.out.println(list1.size());
        }catch(Exception e){
                System.out.println(e.getMessage());
        }


        // list.add(1);
        // System.out.println("Size "+list.size());
        // list.add(2);
        //         System.out.println("Size "+list.size());

        // list.add(3);
        //         System.out.println("Size "+list.size());
            

        // list.contains(3);
        // list.print();
        /*
         * 
         * Properties of list
         * i should be able to Add new elements
         * i should be able to delete element at any index 
         */
    }
}
