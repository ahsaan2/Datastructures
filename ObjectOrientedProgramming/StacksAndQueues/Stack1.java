package ObjectOrientedProgramming.StacksAndQueues;

import java.util.Stack;

public class Stack1 {
    /**
     * A stack represents first in last out --> example can be taken as the plates,
     * put upon one another and we only remove the plates from the top.
     * Whenever we create a stack, it contains no item.
     * "Stacks extends class Vector."
     * vector to be treated as stack --> should allow 5 Operations. 1. Push 2. pop
     * 3. peek 4. empty 5. search.
     * Operations in stack are as:
     * 1--> Push() --> Pushes the item onto the top of the stack.
     * 2--> pop() --> removes the object from the top of the stack and "returns its
     * value."
     * 3--> peek()--> we only "see" the object at the top of the stack ("No removal
     * of the object takes place").
     * 4--> empty()--> checks if the stack is empty.
     * --> search()--> returns the 1 based position where an object is in the stack.
     * Stacks can be implemented in two ways --> Static stacks--> using Arrays
     * and Dynamic stacks --> using linked lists.
     * 
     */

     public static void main(String[] args) {
        // Inuilt stack
     Stack<Integer> stack = new Stack<>();
     stack.push(10);   // first item that will be inserted and it will be the last item to be removed
     stack.push(12);
     stack.push(21);
     stack.push(32);   // last item that is inserted and first item that will be removed
     System.out.println(stack.pop());  // 32--> pop returns the Integer value
     System.out.println(stack.pop());   // 21--> pop returns the integer value
     System.out.println(stack.pop());   // 12 
     System.out.println(stack.pop());  // 10
     System.out.println(stack.pop());  // stack underflow exception--> java.util.EmptyStackException
     // If the stack internally is the array why don't we call it as array--> Because of how it is implemented.
     /**
      * Exception cases in stacks--> 1. Stack overFlow Exception-->>When we try to push into the stack when it
      is already full we get the stackOverFlow exception
      * 2. Stack UnderFlow Exception--> when we try to pop the items from the empty stack it gives us EmptyStacjException
      *
      */
        
     }
}
