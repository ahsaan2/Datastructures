package oopsInJava;

class shape {

    void show() { // this method does not override anything
        System.out.println("I am in Shape");
    }
}

class circle extends shape {
    @Override
    void show() {

        System.out.println("I am in Circle");
    }
}

class triangle extends shape { // multilevel inheritance.
    @Override
    void show() {
        System.out.println("I am in triangle");
    }
}

class test extends triangle {
    @Override
    void show() {
        System.out.println("I will override all the methods present above:-");
    }
}
// a java program can have only one public class, and that class should be made
// the name of the java file.
// we can not have more than one public class in java file.

public class polymorphism { // only this class can be public, if we remove the public and set to some other
                            // class.
    // we get an compile error to define it in its own file

    public static void main(String[] args) {
        shape obj = new shape();
        obj.show();
        obj = new circle(); // will decide which method to call here on the basis of the object type
        obj.show();
        obj = new triangle();
        obj.show(); // We have create only the object of A , and these all will work, because of the
                    // inheritance
        triangle tr = new triangle();
        tr.show();
        // here we can see obj.show is behaving different with different objects.And all
        // this concept is called dynamic method dispatch.
        // because which method it will call we are not sure and it decides it at the
        // run time.

        // for test we have to create a new object to call the method, because there is
        // no inheritance
        test ts = new test();
        ts.show();
        System.out.println();
        System.out.println(
                "the below statements is the example of multilevel inheritance, but due to overriding we get only one statement:");
        System.out.println("Will only print the method body of the class whose object is called:");
        System.out.println();
        // all the class are inherited to the test class, and test class should now
        // print the statements of all
        // methods alone.
        ts.show();

    }
    // polymorphism means many forms
    // 2 types- compile time polymorphism() and runtime polymorphism
    // polymorphism is acheived by the method overloading and method overriding.
    /**
     * 
     * types:
     * 1. Compile-time polymorphism-> early binding=> behavior is defined at the
     * compile time.
     * Acheived by Overloading
     * 2. Runtime polymorphism => behavior is defined at the runt-time.
     * Acheived by Overriding.
     */

    /**
     * Overriding
     * class A{
     * add(int a, int b)
     * }
     * class B extends A{
     * add(int a , int b)
     * }
     * Out of these two methods, which method will be executed is defined at the
     * runtime.
     * 
     */
}
