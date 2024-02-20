package HeapDataStructure;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

  // heap will have an array
  private ArrayList<T> list;

  public Heap() {
    list = new ArrayList<>();
  }

  // we have to swap items
  private void swap(int first, int second) {
    T temp = list.get(first);
    list.set(first, list.get(second));
    list.set(second, temp); // set second as temp.
  }

  // for tree
  private int parent(int index) {
    // we start from index 0
    return (index - 1) / 2;
  }

  private int left(int index) {
    return 2 * index + 1;
  }

  private int right(int index) {
    return index * 2 + 2;
  }

  // insert the items
  private void insert(T value) {
    // add the item at the last
    list.add(value);
    // now check from below to above
    upHeap(list.size() - 1);
  }

  private void upHeap(int index) {
    if (index == 0) {
      return;
    }
    int p = parent(index);
    // if the current item is smaller than the parent then swap
    if (list.get(index).compareTo(list.get(p)) < 0) { // , 0 smaller
      // swap
      swap(index, p);
      // the new element i'm going to check for is parent item
      upHeap(p);
    }
  }

  // remove the item
  private T remove() throws Exception {
    if (list.isEmpty()) {
      throw new Exception("Removing from empty heap:");
    }
    // remove item at the zeroth index
    T temp = list.get(0);
    // swap the last element at the very 0th index
    T last = list.remove(list.size() - 1);
    // after removing this element, if the list is not empty
    if (!list.isEmpty()) {
      list.set(0, last);
      downHeap(0);
    }
    return temp;
  }

  private void downHeap(int index) {
    int min = index;
    int left = left(index);
    int right = right(index);
    // now in left and right , see which one is min
    // if left exists.
    if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
      min = left;
    }
    if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
      min = right;
    }
    if (min != index) {
      swap(min, index);
      downHeap(min);
    }
  }

  // ------------------------HEAPSORT----------------------------------------
  // we have a heap, till the heap is empty keep removing items, and put it in the list.
  public ArrayList<T> heapSort() throws Exception {
    ArrayList<T> data = new ArrayList<>();
    // till the list is not empty, keep removing and add it in data
    while (!list.isEmpty()) {
      data.add(this.remove());
    }
    return data;
  }

  public static void main(String[] args) throws Exception {
    Heap<Integer> heap = new Heap<>();
    heap.insert(34);
    heap.insert(45);
    heap.insert(22);
    heap.insert(67);
    heap.insert(33);
    System.out.println(heap.remove()); // 22
    System.out.println(heap.remove()); // 33
    // heap sort
    ArrayList<Integer> list = heap.heapSort();
    System.out.println(list);
  }
}
/**
   * why heaps-->> heaps are the data structures that we use when we want to be able of access the minimum
   * or the maximum element very quickly.
   * Suppose we have to find the smallest item, what do we do ... we store the items in an array but
   * every time we add an item , we sort the array. By this way the smalles item will be found in O(1)
   * time.
   * //The  insertion in worst case is taking O(N logn) time, because in the worst case you indert an item and it is less
   * then the item at index 0.This complexity is redued by the use of heaps.
   * --------------------------------------HOW HEAPS WORK------------------------------------------------------------------
   * -->> Internally heaps will stored as an array but it will be represented as a tree.
   * ----------------------How heap is represented-------------------------------------
   * 1. In reality it will be stored in an array, we will read it like a tree.
   * 2. Every node will have value >= all of its children.
   * 3. The max item or the min item will be at the very first index, the rest of the array may not be sorted.
   * -->> Suppose we have root node at index i =1.
   * -->> The parent at every index i if going to be equal to i / 2.
   * -->> Left of any index i = 2 * i.
   * -->> Right of any index i = 2 * i + 1.
   * -------------------------------------INSERTION IN THE HEAPS----------------------------------------------------------
   *  -->> minHeap => at the very first index we will have the "minimum" item.
   * 1. while inserting an item, check it with its parent, if the item is smaller than its parent then swap.
   * this will make sure that the smalles item will be at the index = 0.
   *--------------------------------------REMOVING ITEMS FROM THE HEAP-----------------------------------------------------
   * 1. Take the last item and put it into the zeroth index, and search from downwards, check what is smaller, left is smaller or 
   right is smaller. left is smaller swap it.
  -----------insertion/ deletion of items becomes O(log n)in heaps-------------------------------------------------------
   
   *
   */
// maxHeap will always have the highest element at the firs index.
