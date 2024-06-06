package StackDataStructure;

class myException extends Exception {

   public myException(String str) {
        super(str);
    }
}

public class ExceptionInJava {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        // int [] arr = new int[4];
        // put critical statements in the try block
        try {
            j = 18 / i;
            // System.out.println(arr[4]);
            if (j == 0) throw new myException("I don't want 0");
                // // throw new ArithmeticException("I dont want to print 0"); // calls the
                // catch block to catch the exception
                // } // throw used to throw the exception
              //  throw new myException("I dont want 0"); // custom exception, create a class of that exception name
            
        }

        // if we try the critical statement and there is exception, we need to handle it
        // for that we can throw the error in catch block for arithematic exception
        catch (myException e) {
            j = 18 / 1; // handle the exception
            System.out.println("That's the default execution:" + " " + e); // e will take the constructor string
        } catch (Exception e) {
            System.out.println("Exception found");

        }
        System.out.println(j);
    }
}
// HIERARCHY OF EXCEPTIONS-> OBJECT -> THROWABLE ->
// EXCEPTIONS(RUNTIME(ARITHEMATCIC, ARRAYINDEXOUTOFBOUNDS, NULLPOINTEXCEPTION))
// AND ERROR
// RUNTIME EXCEPTIONS ARE UNCHECKED EXCEPTIONS.