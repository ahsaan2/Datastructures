package PriorityQueue;

public class heaps1 {
    private int[] heapArray;
    private int heap_size = 0;
    private int capacity = 0;

     public heaps1(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Capacity should be a positive number.");
        }
        heapArray = new int[capacity];
        this.capacity = capacity;
    }

    // Pushes the element in PQ
    public void offer(int element) throws Exception {
        // if heap_size > capacity
        // then what
        // 1. Increase capacity -> create a new array with 50% extra space -> move the
        // data from old array to new array
        // 2. Throw Exception ->
        if (heap_size >= capacity) {
            throw new Exception("Priority Queue is Full");
        }
        heapArray[heap_size] = element; // store element at the end of the array
        bubble_up(heap_size); // bubble-up
        heap_size += 1; // increase the size.
    }

    // Removes the top elements from the PQ / Min-Heap
    public int poll() {
        // is heap empty.
        if (heap_size == 0) {
            return Integer.MAX_VALUE; // Says heap if empty.
        }

        int rootElement = heapArray[0];
        // swap root with last node
        swap(0, heap_size - 1);

        // Remove the last element
        heapArray[heap_size - 1] = -1;
        heap_size -= 1;  

        // bubble_down
        bubble_down(0);
        return rootElement;
    }

    public int top() {
        return heapArray[heap_size];
    }

    public boolean isEmpty() {
        return heap_size == 0;
    }

    // return index of the parent element
    // index parameter is the index of the some child.
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // returns the index of the left child
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    // returns the index of the right child
    private int rightChild(int index) {
        return index * 2 + 2;
    }

    // swaps 2 elements in the heapArray
    private void swap(int first_index, int second_index) {
        int temp = heapArray[first_index];
        heapArray[first_index] = heapArray[second_index];
        heapArray[second_index] = temp;
    }

    private void bubble_up(int index) {
        while (index != 0 && heapArray[parent(index)] > heapArray[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }
//  0

    private void bubble_down(int index) {
        if (index >= heap_size)
            return;
        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);
        int minimumIndex = index;  

        // Left Child is less than its parent node
        if (leftChildIndex < heap_size && heapArray[leftChildIndex] < heapArray[index]) {
            minimumIndex = leftChildIndex;
        }

        if (rightChildIndex < heap_size && heapArray[rightChildIndex] < heapArray[index]
                && heapArray[rightChildIndex] < heapArray[leftChildIndex]) {
            minimumIndex = rightChildIndex;
        }
        // checking if there was not property voilation.
        if (minimumIndex == index)
            return;
        swap(index, minimumIndex);
        bubble_down(minimumIndex);
    }
    public void display() {
        for (int i = 0; i < heapArray.length; i++) {
            System.out.println(heapArray[i]);

        }
    }

}
