package ObjectOrientedProgramming.PrincipleOfOops.Polymorphism;

public class Shapes {
    // function area is in shapes
    // final void area(){ // final keyword is used to prevent overriding , we can
    // not override the methods that are declared as final.
    // final is also used to prevent inheritance, once a class is declared final its
    // methods will be declared as final too
    void area() {
        System.out.println("I am in Shapes:");
    }
    // static methods can be inherited but they can not be overriden
    // you can inherit but you can't override.
    /**
     * overridin depends on objects, static does not depend on objects thus static
     * methods can not be overriden.
     * 
     */
}
