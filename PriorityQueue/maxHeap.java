package PriorityQueue;

public class maxHeap {
    int[] array;
    int heapSize = 0;
    int capacity = 0;

    maxHeap(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    // get the parent
    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int leftchildIndex(int index) {
        return 2 * index + 1;
    }

    public int rightchildIndex(int index) {
        return 2 * index + 1;
    }

    public void bubbleUp(int index) {
        // the new index should be greater then the parent index
        while (index != 0 && array[index] > array[parent(index)]) {
            swap(parent(index), index);

            index = parent(index);

        }
    }

    public void bubbleDown(int index) {
        if (index >= heapSize) {
            return;
        }
        // we compare the left child and the right child such that , the greater of the
        // 2 will take the root position , once we remove the root index
        int leftIndex = leftchildIndex(index);
        int rightIndex = rightchildIndex(index);
        int maxIndex = index;
        if (leftIndex < heapSize && array[leftIndex] > array[index]) {
            maxIndex = leftIndex;

        }
        if (rightIndex < heapSize && array[rightIndex] > array[index] && array[rightIndex] > array[leftIndex]) {
            maxIndex = rightIndex;

        }
        if (maxIndex == index) {
            return;
        }
        // now swap the index and the minIndex
        swap(index, maxIndex);
        // once we swap the values, there is a possibility again the heap property will
        // be changed, and in this sense the bubble down happens again.
        bubbleDown(maxIndex);
    }

    // we have to add the items in the heap,
    // In max-heap the root node is greater than all the nodes present in the heap.
    public void insert(int index) throws Exception {
        if (heapSize >= capacity) {
            throw new Exception("Heap size is greater then the capacity");
        }
        // we isnert at the last
        array[heapSize] = index;
        // now when we insert the new element, the configuration or the property of the
        // heap gets changed. so, to restore the property we bubble up the new index.
        bubbleUp(heapSize);
        heapSize += 1;
    }

    // now remove the item in the maxHeap
    // the root node will be removed, first we will swap the root node with the last
    // node of the heap , and then we will configure the heap again.
    public int remove(int index) throws Exception {
        if (heapSize <= 0) {
            throw new Exception("Heap is empty:");

        }
        int popped = array[0]; // that is first index is to be removed
        // once we get the first element, we swap the first and the last element of the
        // heap
        swap(0, heapSize - 1);
        array[heapSize] = -1;
        heapSize -=1;
        bubbleDown(0);
        return popped;

    }

    public void swap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    public void display(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
