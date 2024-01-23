package StackDataStructure;

public class DynamicLinkedListStack {
    public static void main(String[] args) throws StackUnderFlowException {
        StackLinkedList stack = new StackLinkedList();
        stack.push(12);
        stack.push(11);
        stack.push(10);
        stack.push(9);
        // stack.push(12);
        // stack.push(32);
        // System.out.println( stack.push(12));
        // System.out.println( stack.push(31));
        // System.out.println( stack.push(21));
        // System.out.println( stack.push(24));
        // System.out.println(stack.push(11));
        // System.out.println(stack.push(100)); // will be the last node that will be
        // pushed
        // System.out.println("Pop value is:");
        System.out.println(stack.pop()); // 9

        System.out.println(stack.pop()); // 10
        System.out.println(stack.pop()); // 11

    }

}
