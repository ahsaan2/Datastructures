package StackDataStructure;

public class DySt extends Stack{
    // we do not want to pass anything in the constructor
    public DySt(){
        super();  // this will call to the constructor of default size 
    }
    // suppose if we want to give the size in the constructor
    public DySt(int size){
        super(size);  // this will the constructor of int size
    }
    // dynamic stack extends all the operation same as that of static stack, but the only problem 
    // that we have in dynamic stack is the push
    // we will override the push 
    @Override
    public boolean push(int item) throws StackOverFlowException{
        if (isFull()) {
                // if the stack is full , we cant push the items , so what do we do
                // we will create a new array that will have the double the size each time
                // when the stack gets full
            int[] temp = new int[data.length * 2]; // double the size each time stack gets full
            // now fill the data items in the temp
            for (int i = 0; i < data.length; i++) {
                // data at i should be in the temp
                temp[i] = data[i];            
            }
            // put data in the temp into data
            data = temp;
        }
        // so when this if conditions fails, that means we will not have a full stack, so we can 
        // add items in the stack
        return super.push(item);
    }
}
