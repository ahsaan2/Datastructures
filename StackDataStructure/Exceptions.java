package StackDataStructure;

public class Exceptions {
    // java uses exceptions to handle error and other exception errors.
    // An exception is a event that occurs during the excecution of the program and
    // disturbs the normal execution of the program.
    public static void main(String[] args) {
        int[] nums = new int[3];
        // // int i =10;
        // int j = 20 / 0; // exception, stops the execution of the program, that means
        // after this no statement will get executed
        // System.out.println(j);
        // System.out.println("Execution is already stopped due to the exception:");

        // to handle the exception.
        // 1. put the critical statement in a separate block
        int i = 0;
        int j = 0;
        try // if we try this critical statement, it will be executed and as a developer we
            // need to catch that error
        {
           j = 20 / i; // once this exception executes, if there is another critical statement below
                        // this that will not be executed
            System.out.println(nums[3]);
            System.out.println(2); // out of bound exception

        }
        // the moment exception is thrown, it is thrown as a object, and we have to
        // accept it as a object
        // catch block is executed only in case of exception.
        catch (ArithmeticException e) { // e means th ebject of class Exception
            System.out.println("Cannot divide by the zero:" + e);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in the limits");
        }
        System.out.println(j); // we will get the value of j as 0 here, because the execution now happens even
                               // after
        // the exception is found because of try-catch block.
        System.out.println("Bye");
        try {
            System.out.println(nums[3]);
        } catch (Exception e) {
           
            System.out.println("Array index out of bounds at 3"+ e);
        }
    }
    // we have to use multiple try catch blocks if there is more than one exception
    // because,if one exception is executed
    // then the execution is stopped, and all the other statements are not executed.
}
/**
 * Errors:->
 * 1. Compile time Error:-technical errors/ Compiler checks the error at compile
 * time
 * 2. Run-time error:- Compile does not check the error at the compile time,
 * though it given exception/error at the runtime
 * // Execution normally stops.
 * 3.Logical error:- there is error in the logic of the program/ also some times
 * called as bugs.
 * 
 */