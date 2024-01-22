package StackDataStructure;

public class DynamicStack extends Stack {
    public DynamicStack() {
        // If we do not pass anything it will just call super
        // what is this super going to be-->>Constructor in the parent class that does
        // not take any argument
        super(); // StackDataStructure()
        // other wise we pass the size

    }

    public DynamicStack(int size) {
        super(size); // will call StackDataStructure(int size)
    }
    // In dynamic stack all other operations in the StackDataStructue is same, only
    // thing that we change is the push. Therefore we have to @Overrride the push method
    @Override
    public boolean push(int item){
        // We just say if it is full, double the array size
        if (this.isFull()) {
            int [] temp = new int[data.length * 2];
            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
                
            }
            data = temp;
            
        }
        // insert item
    }

}
