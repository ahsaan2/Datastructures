package ObjectOrientedProgramming.PrincipleOfOops.Polymorphism;

public class Square extends Shapes {
    // Indicates that a method declaration is intended to override a method
    // declaration in a supertype.

    // void areqa(){ // this method must implement or override the super type that
    // is the Shapes
    // this will run when the object of circle is created, hence it is overriding
    // the parent method
    @Override // Annotations -->> used for check if overriding occurs or not, If not it will
              // give the error
    void area() { // will give an error if area method in the Shapes or parent class is not
                  // available.
        System.out.println("Area of square is:");
    }
    // same function in child class and parent class, child class is overriding the
    // main or parent class

    // this has a function called area and shapes ahve a function called area, and
    // this is what is called Overriding
    // overriding requires a subclass or child class to provide variants of methods
    // previously provided by a superclass or parent class.
}
