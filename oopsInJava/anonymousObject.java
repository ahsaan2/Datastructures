package oopsInJava;
    class person{
        person(){
            super();
            System.out.println("I am in class person");
        }
    }
    class human extends person{
        human(){
            super();
            System.out.println("I am in class human");
        }        
    }
public class anonymousObject {
    // Anonymous objects-->> means nameless, We create an object without any reference variable.
    // anonymous objects allow you to create  an object without any name assigned to it.

    public static void main(String[] args) {
        // new person();  // anonymous object, will call the constructor of A
        // prints I am in class a
        new human();  // i am in class person and i am in class human
        // every time it creates a new object and we cannot reuse it.
        
    }
}
