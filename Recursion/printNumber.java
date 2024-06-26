package Recursion;

public class printNumber {
    public static void main(String[] args) {
        // suppose we need to have a function tha prints 1 to 5
        print(1);
    }

    static void print(int n) { // this function calls the print fuction , and prints 1
        System.out.println(n);
        // we can create a new function here, that calls the other function
        print2(2);
    }
    // A function calling another function,
    // All the function have the same body and paramters.

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);

    }

    static void print4(int n) {
        System.out.println(n);
        // we will not call any other function here
    }

}
