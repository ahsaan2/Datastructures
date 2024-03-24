package BinaryHeap;

public class maxPriorityQueue {
    // the binary heap is a data structure that helps in implementation of priority
    // queue
    // operations efficiently.A binary heap is a complete binary tree in which each
    // node value is
    // greater/equal or less/equal than the values of its children.
    /**
     * priority queue__>> is a data structure that allows us to find minimum/maximum
     * elements
     * amoung a collection of elements in contant time
     * deleteMax() / deleteMin() --> return and remove larges and smallest elements
     * getMax() / getMin() --> return largest and smalles element.
     * 
     */
    // we have a integer size and the size of the queue
    int[] heap; // will store the heap elements
    int size;

    maxPriorityQueue(int capacity) {
        heap = new int[capacity + 1];
        // we create a capacity +1 because the index 0 is not used and to fill all the
        // items
        // we create a size plus 1
        size = 0;
    }

    // create a function for the empty
    public boolean isEmpty() {
        return size == 0;
    }

    // function for size
    public int size() {
        return size;
    }

    // insert function for the max-heap
    public void insert(int value) {
        // if at some point the size becomes heap length we resize the heap length
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        // increase the size of max priority queue by 1 and then insert
        size++;
        // insert at the heap at index size
        heap[size] = value; // insert 4 for the first time, it will then call the swim method
        // insert 5 for the second time it will call the swim method, and here value at
        // k is greater than the
        // parent or k/2 then the swim method or swapping of the elmenents will occur

        swim(size); // here for first time size is 1

    }

    public void swim(int K) { // ke takes the value of size each time. first size is 1, k is 1 and so on.
        // if k value that is size is greater than one and if the inserted value is
        // greater than the
        // parent then we swap the elements
        // parent of kth index is given by k/2
        while (K > 1 && heap[K / 2] < heap[K]) {
            // heap[K/2] < heap[K]) if value is less then the parent then swap
            int temp = heap[K];
            heap[K] = heap[K / 2];
            heap[K / 2] = temp;
            // after we are done with the swap we traverse to its parent by assigningk to k
            // /2
            K = K / 2; // because we need to continue shifting up till new value inserted is at correct
                       // poistion

        }

    }

    public void resize(int capacity) {
        // once the above if condition comes true, that means the heap array is filled
        // completely
        // so, in the resize method, what do we do. we first create a new array with
        // what ever the capacity
        // we passed, and we copy each and every element from the heap to the temp array
        // and then reassing
        // the heap to this newly created array
        int[] temp = new int[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        // reassign
        heap = temp; // so heap will point to the array which is of twice the current length
    }

    // delete maximum element in the heap
   
    // display the heap values
    public void display() {
        for (int i = 1; i < heap.length; i++) {
            System.out.println(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        maxPriorityQueue mpq = new maxPriorityQueue(3);// we create a max priority queue of capacity 3
        // the integer array will be of the capacity 4 , because the first space of
        // index 0 is not used
        mpq.insert(4);
        mpq.insert(5);
        mpq.insert(2);
        mpq.insert(6);
        mpq.insert(1);
        mpq.insert(3);

        mpq.display();

        // System.out.println(mpq.size());
        // System.out.println(mpq.isEmpty());
    }
}
// delete max heap is pendi
