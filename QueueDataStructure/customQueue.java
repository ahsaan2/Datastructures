package QueueDataStructure;

public class customQueue {
    public int[] data;
    protected static final int DEFAULT_SIZE = 10;

    private int end = 0; // data will be added at the end
    // creating the constructor for default size and size

    public customQueue(int size) {
        // size will be equal to that of the data
        this.data = new int[size];
    }

    public customQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        // queue will be full when the size of data(end) will be equal to its length
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0; // no element is added in the queue
    }

    // add the elmements in the queue
    public boolean add(int item){
        // there is the possibility that the queue will be full
        if (isFull()) {
          return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Add the items in the queue:");
        }
        // In queue we have to remove the items at the front 
        // store the item at front in a variable and then shift the items towards left
        int removed = data[0];  // first item will be removed
        // shifting the item at i to item at i -1
        for (int i = 1; i < data.length; i++) {
            // data at i should be equal to the data at i -1
            data[i -1] = data[i];
        }
        end--;
        return removed;
    }
    // display the queue
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print( data[i]+"<-");
        }
        System.out.println("end");
    }
}
/**
 * Circular queue-->> where the last element of the queue is connected to the first element of the queue
 * It is also called Ring Buffer.
 */
