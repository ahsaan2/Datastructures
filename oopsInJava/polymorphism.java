package oopsInJava;

class shape {
    
    void show() {
        System.out.println("I am in Shape");
    }
}

class circle extends shape {
    void show() {
        System.out.println("I am in Circle");
    }
}
class triangle extends shape{
    void show(){
        System.out.println("I am in triangle");
    }
}
class test{
    void show(){
        System.out.println("I will not work with the shape object because i am not extended.");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        shape obj = new shape();
        obj.show();
        obj = new circle();
        obj.show();
        obj= new triangle();  
        obj.show();    // We have create only the object of A , and these all will work, because of the inheritance
        triangle tr = new triangle();
        tr.show();
        // here we can see obj.show is behaving different with different objects.And all this concept is called dynamic method dispatch.
        // because which method it will call we are not sure.
        
        // for test we have to create a new object to call the method, because there is no inheritance
        test ts = new test();
        ts.show();

    }
    // polymorphism means many forms
    // 2 types- compile time polymorphism() and runtime polymorphism
    // polymorphism is acheived by the method overloading and method overriding.
    /**
     * 
     * types:
     * 1. Compiletime polymorphism-> early binding=> behavior is defined at the
     * compile time.
     * Acheived by Overloading
     * 2. Runtime polymorphism => behavior is defined at the runt time.
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
