public class Main {

  /**
   * Error-->>Errors are caused by serious problems that are outside the control
   * of the program, such as running out of the memory or a system crash.
   * since errors are generally caused by problesm that cannot be recovered from,
   * it's usually
   * not appropriate for a program to catch errors.
   * Ex.OutOfMemoryError, StackOverFlowError, NoClassDeFoundError.
   *
   * Exceptions-->>(Exception-->> prevents the normal flow of the program) are
   * used to handle errors that can bre recovered from within
   * the program. Exceptions are represented by the Exception class and its
   * subclasses
   * Ex. NullPOinterException, IllegalArgumentException, IOException.
   */
  // --------------------------------------------------------------------------
  /**
   * ObjectClass -->>Throwable(handles all the exception in java)-->> 2 types
   * 1. Exceptions 2. Errors.
   * -------------------Exceptions are of two types ----------
   * a. checked Exceptions-->> are the ones that are checked during the compile
   * time.
   * b. unChecked Exception-->> the compiler is not able to detect, these are
   * known to the compiler
   * at the run-time.
   */
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    // int c = a / b;
    // System.out.println(c);  // arithematic exception

    try { // says that try all these things, and if some thing goes bad, then use the catch
      // int c = a /b;
      divide(a, b);
    } // to catchmore than one exception, more strict exceptions should be caught first, if we use two catch block firs, all the exceptions will be caught ther only
    // and then it will show error for some other catch block.
    catch (ArithmeticException e) {
      System.out.println(e.getMessage()); // return detail message  --> / by zero
    } catch (Exception e) {
      System.out.println("Normal Exception:");
    } finally {
      System.out.println("No matter what happens this will always execute:");
      // this will run either if exception is thrown or not.
    }
  }

  static int divide(int a, int b) throws ArithmeticException { // throws used to declare exception
    if (b == 0) {
      throw new ArithmeticException("Do not divide by zero");
    }
    return a / b;
  }
}
