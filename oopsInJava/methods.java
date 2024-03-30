package oopsInJava;

class computer {
    // if we have a variable here, it becomes our instance varibale
    // int num1; variable in the class but outside the method
    // in a class we can define the behavior
    public void playMusic() {
        // define the befavior of the method
        System.out.println("play music:");
    }

    public String getNumber(int cost) { // mentioning the type we want to return
        // int cost is the local varaible. that is varaible inside the method.
        return "number";
    }

    public String getNumber(int cost, int value) {
        // methods with the same name is known as method overloading
        return "getNumber";
    }
    // each method will generate its own stack frame, that is for every method we
    // will have its own method frame.
}

public class methods {
    public static void main(String[] args) {
        // to use the methods we need to create the object of the class, where these
        // methods are present
        computer com = new computer();
        String ans = com.getNumber(12);  // com will have the address of the getNumber method and calls it.
        // so, we can say that there is a link between the stack and heap because of the address.
        System.out.println(ans);
        String ans2 = com.getNumber(12, 21);
        System.out.println(ans2);
    }
}
/**
 * JVM is usually divided into 2 parts :-> 1. Stack Memory and heap memory 
 * Objects get created in the heap memory  and the reference to that object is present inside the stack memory.
        computer com = new computer();
        // com is inside the stack memory.
        computer is inside the heap memory.
    -->> Local varaibles are created inside the stack
    -->> Instance variables are created inside the heap and they are the part of the object they belong to.
 * 
 * 
 */