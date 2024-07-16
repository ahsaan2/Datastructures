package PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        minHeap mh = new minHeap(6);
        heaps1 hh = new heaps1(6);
        maxHeap mx = new maxHeap(6);
        // mh.insert(10);
        // mh.insert(0);
        // mh.insert(5);
        // mh.insert(3);
        mh.insert(5);
        mh.insert(4);
        mh.insert(3);
        mh.insert(2);
        mh.insert(1);
        hh.offer(5);

        
        hh.offer(4);
        hh.offer(3);
        hh.offer(2);
        hh.offer(1);
        mh.insert(1);
        mx.insert(1);
        mx.insert(2);
        mx.insert(3);
        mx.insert(4);
        mx.insert(5);
        // mx.insert(5);
        // mx.insert(5);

        
       


        mx.display();

        // while (!mh.isEmpty()) {
        //     System.out.println("Popped = " + mh.remove());
        // }
    }
}
