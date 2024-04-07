package StackDataStructure;
// create a class for the exceptions
class myOwnException extends Exception{
    public myOwnException(String str){  // if we want to pass the message , we have to call the super class
        super(str);
    }
}

public class exceptionJava {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            // calling the exception
            // if (j == 0) throw new ArithmeticException("Call the catch block");
            // create your own excetion, also if we have to create our own exception we have to create a class for that also
            if (j == 0) throw new myOwnException("Call the default value in catch block:");

        } catch (myOwnException e) {
            j = 18/1; // we do not want to divide by 0
            // System.out.println("Cannot divide by 0");
            System.out.println("the default value is:" + e);
        }
        System.out.println(j);
    }
}
