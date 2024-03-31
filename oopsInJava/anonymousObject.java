package oopsInJava;
    class person{
        person(){
            super();
            System.out.println("I am in class A");
        }
    }
    class human extends person{
        human(){
            super();
            System.out.println("I am in class B");
        }        
    }
public class anonymousObject {
    // Anonymous objects-->> means nameless, We create an object without any reference variable.
    // anonymous objects allow you to create  an object without any name assigned to it.

    public static void main(String[] args) {
        new A();  // anonymous object, will call the constructor of A
        // prints I am in class a
        
    }
}
