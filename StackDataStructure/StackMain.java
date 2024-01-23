package StackDataStructure;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DySt stack = new DySt();

        stack.push(23);
        stack.push(21);
        stack.push(24);
        stack.push(43);
        stack.push(40);
        stack.push(50); // Exception-->> can not push stack is full
        stack.push(60); // Exception -->> can not push stack is full
        stack.push(10);
        stack.push(8);
        stack.push(7);
        stack.push(4);



        System.out.println("Peek item is:");   // 10
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        

       
        System.out.println(stack.peek()); // 21
        System.out.println(stack.isEmpty()); // false
    }
}
