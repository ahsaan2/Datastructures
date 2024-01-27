package ObjectOrientedProgramming;

public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b); // no swapping will take place
        // because in primitives the pass by values are just values and "a" will be
        // passed only as 10
        Integer num = 45; // created as an object.
        /**
         * The wrapper classes in java are used to convert "primitive data types to
         * objects"
         * int --> wrapper class is "Integer"
         * booleadn --> wrapper class in Boolean
         * 
         */

        System.out.println(num);
        System.out.println(a);
        // Integer c = 23;
        // Integer d = 34; // these are reference variables
        // swap1(c, d);
        // System.out.println(swap1(c, d);
        // final int bonus = 22;
        // bonus = 32; // final variable cannot be assigned
        A obj;
        for (int i = 0; i < 1000000000; i++) { //
            obj = new A("random");
            System.out.println(obj);

        }

    }

    // In java there is no such thing called pass by values --> everything is pass
    // by reference
    static void swap(int a, int b) { // swaps in this function only
        int temp = a;
        a = b;
        b = temp;
    }

    // Integer --> is final
    static void swap1(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;

    }
    // final keyword-->>it prevents your content to be modified
    // final int increase = 25; --> It can not be modified now
    /**
     * final int age = 19; Always initialize it while declaring it.
     */
    /**
     * -->>Garbage Collection in java-->><>Java does not allow to destroy objects manually.
     * so we tell java to do these things when ever you decide to destroy object
     * that is done by finalize.
     * Finalize-->> it is called by the garbage collector just before the object is
     * to be destroyed, this method is used to perform any necessary clean up
     * before the object is destroyed.
     */

}

class A {
    final int num = 10;
    String name;

    public A(String name) {  // constructor
        this.name = name;

    }

    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed:"); // we can not free the memory but we can
        // tell what to do when the memory is filled.
    }
}
