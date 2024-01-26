package QueueDataStructure;

public class DynamicQueue extends customQueue {
    // creating the constructors for the size
    public DynamicQueue() {
        super();// will have no arguments
    }

    public DynamicQueue(int size) {
        super(size); // will take argument as size

    }

    public boolean add(int item) {
        if (this.isFull()) {
            // if the queue gets full, double the size of the queue
            int[] temp = new int[data.length * 2];
            // traverse the data and put them into the temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.add(item);
    }

}
