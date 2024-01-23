package StackDataStructure;

public class DynamicStack extends Stack {
    public DynamicStack() {
        // If we do not pass anything it will just call super
        // what is this super going to be-->>Constructor in the parent class that does
        // not take any argument
        super(); // StackDataStructure()
        // other wise we pass the size

    }
    // creating a construtor that takes arguments as size

    public DynamicStack(int size) {
        super(size); // will call StackDataStructure(int size)
    }

    // In dynamic stack all other operations in the StackDataStructue is same, only
    // thing that we change is the push. Therefore we have to @Overrride the push
    // method
    @Override
    public boolean push(int item) throws StackOverFlowException {
        // We just say if it is full, double the array size
        if (this.isFull()) {
            // if the stack isfull then we create a temp array that has a size twice the
            // length of the data
            // and whenever the stack gets full, the size is increased by two times
            int[] temp = new int[data.length * 2]; // temp has the size twice
            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) { // traversing teh original data length and then putting
                // them in the temp variable which will keep on expanding in the dynamic manner.
                temp[i] = data[i];

            }
            data = temp;  // value of temp now gets stored in the data

        }
        // insert item
        // At this point we know that array is not full and we insert the normally

        return super.push(item); 
        /**
         * the super keyword refers to the superclass(parent) object. it is used to call superclass methods and to access the superclass constructors.
         * In simpler words it is the immediate parent class instance variables
         */
    }

}
