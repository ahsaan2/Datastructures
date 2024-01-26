package QueueDataStructure;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        customQueue queue = new customQueue();
        queue.add(21);
        queue.add(23);
        queue.add(43);
        queue.add(54);
        // removal occurs at the front of the queue
       System.out.println(queue.remove());  // 21
        queue.display();

    }
}
