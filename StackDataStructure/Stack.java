package StackDataStructure;

// import java.util.LinkedList;

// import SingleLinkedList.CustomLinkedList;

// create the own class for the stackOverFlow Exception 
class StackOverFlowException extends Exception {
    // constructor for the stackOverFlow exception
    public StackOverFlowException() {
        super("StackOverflow");
    }

    // create another constructor that takes the arguments
    public StackOverFlowException(String message) {
        super(message);

    }
}

// create the own class for stackUnderFlow exception
class StackUnderFlowException extends Exception {
    // create the constructor
    public StackUnderFlowException() {
        super("StackUnderFlow!");
    }

    public StackUnderFlowException(String message) {
        super(message);
    }
}
// class CustomStack<T>{
// // linkedList, use the linkedList which you have create
// private CustomLinkedList<T> list;
// private List<T> internalJavaList;
// public CustomStack(){
// list = new CustomLinkedList<T>();
// internalJavaList = new LinkedList<>();
// }
// public push add to the linked list
// public pop remove from linked list
// public check if linkedlist is_empty

// Make it Generic
public class Stack {
    // we have data and a default size
    // this stack will be of the static type
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    // create a constructor and we do not proveide it anything --> it will take the
    // default size
    public Stack() {
        this(DEFAULT_SIZE);
    }

    // create a pointer that will keep on increasing to add the items
    private int pointer = -1;

    // create a constructor for the size
    public Stack(int size) {
        this.data = new int[size];
    }

    // check if the item we pushed is present or not
    public boolean push(int item) throws StackOverFlowException {
        // we can have a condtion where the stack is full
        if (isFull()) {
            throw new StackOverFlowException("Cannot push " + item + " To stack");
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    // Stack isFull
    public boolean isFull() {
        // when will be the stack when the pointer will be pointing to the last data
        // item
        return pointer == data.length - 1;
    }

    // create a pop
    public int pop() throws Exception { // this can return the exception if the stack is empty
        if (isEmpty()) {
            throw new Exception("Cannot pop stack is empty:");
        }
        int removed = data[pointer];
        pointer--;
        return removed;

    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    // create peek
    public int peek() throws StackUnderFlowException {
        // also can be empty
        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is empty:");
        }
        return data[pointer];
    }
}
/**
 * Exceptions and Errors
 * Exceptions--> it is an event that disrupts the normal flow of the program
 * during the execution.
 * We can handle the exceptions using the try-catch block.
 * Error-->> represent the exceptional conditions that are not checked at the
 * runtime, they are checked at the runtime.
 * And the most important part--> error will not force you to use the try-catch
 * block to handle it.
 * Example of error is: StackOverFlow(Occurs due to the infinite recursion) is a
 * buffer overflow error.
 */
