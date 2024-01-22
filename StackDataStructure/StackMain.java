package StackDataStructure;

public class StackMain {
    public static void main(String[] args) throws Exception{
        Stack stack = new Stack(5);

        stack.push(23);
        stack.push(21);
        stack.push(24);
        stack.push(43);
        stack.push(21);
        // stack.push(21); // Exception-->> can not push stack is full
        // stack.push(21); // Exception -->> can not push stack is full

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println("Peek item is:");
        System.out.println(stack.peek()); // 21
        System.out.println(stack.isEmpty()); // false
    }
    }
    

