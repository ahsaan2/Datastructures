package PriorityQueue;

import java.util.Comparator;

class MinHeap<TDataType> {
    // In min-heap the root node value is smaller then its child node values.
    Object[] array; // string, character, CustomObject -> what ever is comparable
    int capacity = 0;
    int heapSize = 0;
    Comparator<TDataType> comparator;

    public MinHeap(int capacity, Comparator<TDataType> comparator) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Capacity cannot be less than 1");
        }
        array = new Object[capacity]; // T[] ts = (T[]) new Object[n];
        this.capacity = capacity;
        this.comparator = comparator;
    }

    // get the parent, 
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
    public void insert(TDataType element) throws Exception {
        // we can have excception here also, if the capacity of the array is full
        if (heapSize > capacity) {
            throw new Exception("No capacity to insert element in the heap");
        }
        // we insert the element at the last index
        array[heapSize] = element; // heapsize has now 1 element
        // once we insert the new element in the heap, it can voilate the heap property
        // , now to maintain that we do the swapping of the parent index and the new
        // index value
        // using bubble up approach
        bubbleUp(heapSize);
        heapSize += 1;
    }

    public void display() {
        for (int i = 0; i <heapSize ; i++) {
            System.out.println(array[i]);
        }
    }

    // now to remove the element in the heap
    public TDataType remove() throws Exception {
        if (heapSize == 0) {
            throw new Exception("Heap array is empty, cannot remove the element");
        }
        // while removing the element from the heap, we first swap the root node and the
        // last node of the heap
        Object popped = array[0];
        // swap the root node and the last node
        swap(0, heapSize - 1);
        heapSize -= 1;
        // once we remove the element from the heap, the property of the heap can be
        // voilated, and to counter that we do the topdown approach/ bubbleDown
        bubbleDown(0);
        return (TDataType) popped; // Casting
    }

    public void bubbleDown(int index) {
        // we need the left and right child and the min index
        int leftchildIndex = leftChild(index);
        int rightchildIndex = rightChild(index);
        int minIndex = index;

        //new
        if(leftchildIndex < heapSize){
            int left_cmp = this.comparator.compare((TDataType)array[leftchildIndex], (TDataType)array[index]);
            if(left_cmp <= -1)
                minIndex = leftchildIndex;
        }

        if(rightchildIndex < heapSize){
            int right_cmp = this.comparator.compare((TDataType)array[rightchildIndex], (TDataType)array[index]);
            int right_left_cmp = this.comparator.compare((TDataType)array[rightchildIndex], (TDataType)array[leftchildIndex]);
            if( right_cmp <= -1 && right_left_cmp <= -1)
                minIndex = rightchildIndex;
        }

        // now if the condition is not voilate while removing the element then
        if (minIndex == index) {
            return;
        }
        swap(index, minIndex);
        // also again bubble-down once the new indexes are changes
        bubbleDown(minIndex);

    }

    public void bubbleUp(int index) {
        while (index != 0 && this.comparator.compare((TDataType)array[parent(index)],(TDataType)array[index]) >= 1) {
            swap(index, parent(index));
            // once the elements are swapped, indexes change
            index = parent(index);
        }
    }

    void swap(int first, int second) {
        Object temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
