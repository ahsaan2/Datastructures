package QueueDataStructure;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        DynamicQueue queue = new DynamicQueue(4);
        // will items continueously, if the queue gets full then the size will get double
        queue.add(21);
        queue.add(23);
        queue.add(43);
        queue.add(54);
        queue.add(11);
        queue.add(44);
        queue.add(33);

        queue.display();
        // removal occurs at the front of the queue
        // due to shifting of items, removal here takes O(n) time complexity
       System.out.println(queue.remove());  // 21

        queue.display();
        customQueue queue2 = new customQueue(4);
        // will add items only upto 4
       
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        queue2.add(5);// wont be displayed
        queue2.add(6);
        queue2.display();

    }
}
