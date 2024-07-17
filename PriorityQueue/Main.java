package PriorityQueue;

// import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        // MinHeap mh = new MinHeap(6);
        // heaps1 hh = new heaps1(6);
        // maxHeap mx = new maxHeap(6);
        MinHeap<String> strHeap = new MinHeap<String>(5,(a,b) -> {
            if(a.length() > b.length()){
                return 1;
            }
            if(a.length() < b.length()){
                return -1;
            }
            // same
            int len = a.length();
            for(int i=0;i<len;i++){
                char ch1 = a.charAt(i);
                char ch2 = b.charAt(i);
                if(ch1 == ch2) continue;
                if(ch1 > ch2){
                    return 1;
                }
                if(ch1 < ch2) {
                    return -1;
                }
            }
            return 0;

        }); // This is wrong
        strHeap.insert("Shaana");
        strHeap.insert("Anwar");

        System.out.println("-------------------------------------------");
        MinHeap<Integer> heap = new MinHeap<Integer>(5, (a,b) -> {
            if(a == b) return 0;
            if(a > b) return -1;
            return 1;
        });
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.insert(8);
        // heap.insert(9);
        // heap.display();
        while (!heap.isEmpty()) {
            System.out.println("Polled "+heap.remove());
        }
        // strHeap.display();
        // mh.insert(10);
        // mh.insert(0);
        // mh.insert(5);
        // mh.insert(3);
        // mh.insert(5);
        // mh.insert(4);
        // mh.insert(3);
        // mh.insert(2);
        // mh.insert(1);
        // hh.offer(5);

        
        // hh.offer(4);
        // hh.offer(3);
        // hh.offer(2);
        // hh.offer(1);
        // mh.insert(1);
        // mx.insert(1);
        // mx.insert(2);
        // mx.insert(3);
        // mx.insert(4);
        // mx.insert(5);
        // mx.insert(5);
        // mx.insert(5);

        // mx.display();

        // while (!mh.isEmpty()) {
        //     System.out.println("Popped = " + mh.remove());
        // }
    }
}
