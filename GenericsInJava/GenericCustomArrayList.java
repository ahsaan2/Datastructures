package GenericsInJava;

import java.util.Arrays;

public class GenericCustomArrayList<T> {
    // public class GenericCustomArrayList<T extends Number>{
        //here T should be either Number or its subClass
    // here extends Number is a wildCard, and it deos the more typing checking like
    // Integer is present in the Number class.this is known as wildcard
    // wildCard-->> is a special kind of argument that controls the type safety of
    // the use of generic types.

    // }
    // generics-->> parameterized types.The idea is to allow type[string, integer,
    // character etc]
    // to be paramter for a method, class and interface.
    // private int[] data; // data will not be now of int type, it be of type T
    private Object[] data;
    // default size, after which the arrayList doubles
    static int DEFAULT_SIZE = 10;
    // size of the data
    private int size = 0;

    // initialize the data at the size of the array
    public GenericCustomArrayList() {
        // add data at the default-size
        data = new Object[DEFAULT_SIZE];
    }

    // method to add
    public void add(int num) {
        // if the size of the array is full, we have to resize the arrayList
        if (isFull()) {
            resize();
        }
        // else add the item at index size and increase the size
        data[size] = num;
        size++;
    }

    // remove the items from the array
    public T remove() {
        @SuppressWarnings("unchecked")
        T removed = (T) (data[--size]);
        return removed;
        // decrease the size
    }

    // list will be full when the size == length of the data
    public boolean isFull() {
        return size == data.length;
    }

    // resize the list and copy the items in the new list
    public void resize() {
        Object[] temp = new Object[2 * data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // get the size of the list
    public int size() {
        return size;
    }

    // set the value at index
    public void get(int index, T value) {
        data[index] = value;

    }

    // get the index
    @SuppressWarnings("unchecked")
    public T getIndex(int index) {
        return (T) data[index];
    }

    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + '}';

    }

    public static void main(String[] args) {
        GenericCustomArrayList<Integer> list = new GenericCustomArrayList<>();
        list.add(12);
        list.add(21);
        list.add(23);
        list.add(43);
        list.add(43);
        list.add(43);
        list.add(43);

        System.out.println(list);

    }
}
