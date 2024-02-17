package GenericsInJava;

import java.util.Arrays;

public class CustomArrayList {

  // We keep adding items in it, and at a particular time when the list gets full,
  // it gets doubled and copies all the items in the new one.
  // we have the data, and let us have a default size of the array
  private int[] data;
  public static int DEFAULT_SIZE = 10;
  // lets have the size of the data
  private int size = 0;

  public CustomArrayList() {
    // initialize the data
    this.data = new int[DEFAULT_SIZE];
  }

  // we have to have a method to add the items.
  public void add(int num) {
    // while adding we can have the arraylist as full, so we have to resize when it
    // becomes full
    if (isFull()) {
      resize();
    }
    // add the num at the data size, and increase the size
    data[size] = num;
    size++;
  }

  // return the removed item
  public int remove() {
    int removed = data[--size]; // reduce the size by 1, also works as index value
    return removed;
  }

  // get the data at the index
  public int getIndex(int index) {
    return data[index];
  }

  // size
  public int size() {
    return size;
  }

  // set the value
  public void setDAta(int index, int value) {
    data[index] = value;
  }

  public boolean isFull() {
    // arraylist is full when we have size equal to the data length
    return size == data.length;
  }

  // create the resize
  public void resize() {
    // we create a temp array, copy the data into this array
    int[] temp = new int[data.length * 2];
    // copying
    for (int i = 0; i < data.length; i++) {
      // copy data at index to temp at index i
      temp[i] = data[i];
    }
    // my new data is
    data = temp;
  }

  @Override
  public String toString() {
    return (
      "CustomArrayList{" +
      "data=" +
      Arrays.toString(data) +
      ", size=" +
      size +
      '}'
    );
  }

  public static void main(String[] args) {
    CustomArrayList list = new CustomArrayList();
    list.add(13);
    list.add(32);
    list.add(43);
    System.out.println(list);
  }
}
/**
 * ArrayList is unsynchronized and not thread-safe, whereas Vectors are. Only one thread can call methods
 *  on a Vector, which is slightly overhead but helpful when safety is a concern. Therefore, in a 
 * single-threaded case, ArrayList is the obvious choice, but where multithreading is concerned, 
 * vectors are often preferable.
 */
