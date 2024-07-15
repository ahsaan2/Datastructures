package PriorityQueue;

public class minHeap {
    // In min-heap the root node value is smaller then its child node values.
    int[] array;
    int capacity = 0;
    int heapSize = 0;

    minHeap(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Capacity cannot be less than 1");

        }
        array = new int[capacity];
        this.capacity = capacity;

    }

    // get the parent
    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int leftChild(int index) {
        return 2 * index + 1;
    }

    public int rightChild(int index) {
        return 2 + index + 1;
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    // Now, we have 2 main operations on the heaps.
    // 1. Insertion--> WE always insert the new element in the heap at the last
    // index (Bottom right most).
    public void insert(int index) throws Exception {
        // we can have excception here also, if the capacity of the array is full
        if (heapSize > capacity) {
            throw new Exception("No capacity to insert element in the heap");
        }
        // we inset the element at the last index
        array[heapSize] = index; // heapsize has now 1 element
        // once we insert the new element in the heap, it can voilate the heap property
        // , now to maintain that we do the swapping of the parent index and the new
        // index value
        // using bubble up approach
        bubbleUp(heapSize);
        heapSize += 1;
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    // now to remove the element in the heap
    public int remove() throws Exception {
        if (heapSize == 0) {
            throw new Exception("Heap array is empty, cannot remove the element");
        }
        // while removing the element from the heap, we first swap the root node and the
        // last node of the heap
        int popped = array[0];
        // swap the root node and the last node
        swap(0, heapSize - 1);
        array[heapSize] -= 1;
        heapSize -= 1;
        // once we remove the element from the heap, the property of the heap can be
        // voilated, and to counter that we do the topdown approach/ bubbleDown
        bubbleDown(heapSize);
        return popped;
    }

    public void bubbleDown(int index) {
        if (index > heapSize) {
            return;
        }

        // we need the left and right child and the min index
        int leftchildIndex = leftChild(index);
        int rightchildIndex = rightChild(index);
        int minIndex = index;
        if (leftchildIndex < array[heapSize] && leftchildIndex < minIndex) {
            minIndex = leftchildIndex;
        }
        // for the right childindex to be minimum, we need to have the left child,
        // minIndex also smaller
        if (rightchildIndex < array[heapSize] && rightchildIndex < minIndex && rightchildIndex < leftchildIndex) {
            minIndex = rightchildIndex;
        }
        // now if the condition is not voilate while removing the element then
        if (minIndex == index) {
            return;

        }
        swap(index, minIndex);
        // also again bubble-down once the new indexes are changes

    }

    public void bubbleUp(int index) {
        while (index != 0 && array[parent(index)] > array[index]) {
            swap(index, parent(index));
            // once the elements are swapped, indexes change
            index = parent(index);

        }
    }

    void swap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
