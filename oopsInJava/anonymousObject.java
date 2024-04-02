package oopsInJava;
    class person{
        person(){
           super();  // every class calls the object class, and here the super class present shows that the object class is called
            // also no need to mention super here
            System.out.println("I am in class person");
        }
    }
    class human extends person{
        human(){
            super();
            // In inheritance what happens is that once we create the object, the construtor of the object is called
            // but just before the constructor calling, super() class is called. and that super class takes the control to
            // the parent class and calls the constructor of that method first.
            System.out.println("I am in class human");
        }        
    }
public class anonymousObject {
    // Anonymous objects-->> means nameless, We create an object without any "reference" variable.
    // anonymous objects allow you to create  an object without any name assigned to it.

    public static void main(String[] args) {
        // syntax of Anonymous Object is->
        // new className()
        new person();  // anonymous object, will call the constructor of A
        // prints I am in class person
        new human();  // i am in class person and i am in class human
        // every time it creates a new object and we cannot reuse it.
        // new person();
        
    }
}
