package ObjectOrientedProgramming.StacksAndQueues;



public class StackCustomImplementation {
   // we have  data and a default size
   // this stack will be of the static type
   protected int[] data;
   protected static final int DEFAULT_SIZE = 10;
   // create a constructo and we do not proveide it anything --> it will take the default size
   public StackCustomImplementation(){
    this(DEFAULT_SIZE);
   }
   // create a pointer that will keep on increasing to add the items
   int pointer = -1;
   // create a constructor for the size
   public StackCustomImplementation(int size){
    this.data = new int[size];
   }
   // check if the item we pushed is present or not
   public boolean push(int item){
    // we can have a condtion where the stack is full
    if (isFull()) {
        System.out.println("Cannot push stack is full:");
        return false;
        
    }
    pointer++;
    data[pointer] = item;
    return true;
   }
   // creating isFull
   public boolean isFull(){  
    // when will be the stack when the pointer will be pointing to the last data item
    return pointer == data.length -1;
   }
   // create a pop
   public int  pop()throws Exception{  // this can return the exception if the stack is empty
    if (isEmpty()) {
        throw new Exception("Cannot pop stack is empty:");      
    }
    int removed = data[pointer];
    pointer--;
    return removed;

   }
   public boolean isEmpty(){
    return pointer == -1;
   }
   // create peek
   public int peek()throws Exception{
    // also can be empty
    if (isEmpty()){
        throw new Exception("Stack is empty:");

        
    }
    return data[pointer];
   }
}
