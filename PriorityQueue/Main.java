package PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        minHeap mh = new minHeap(6);
        // mh.insert(10);
        // mh.insert(0);
        // mh.insert(5);
        // mh.insert(3);
        // mh.insert(30);
        // mh.insert(8);
        // mh.insert(7);
        // mh.insert(6);
        // mh.insert(20);
        // mh.insert(1);
        mh.insert(1);
        mh.insert(2);
        mh.insert(3);
        mh.insert(4);
        mh.insert(5);

        mh.display();

        while (!mh.isEmpty()) {
            System.out.println("Popped = " + mh.remove());
        }
    }
}
