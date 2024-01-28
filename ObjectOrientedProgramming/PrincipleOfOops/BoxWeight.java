package ObjectOrientedProgramming.PrincipleOfOops;

// this class should have all the properties of the class Box, So we extend those properties here
public class BoxWeight extends Box {
    double weight = -1;

    public BoxWeight() {
        // super();
        this.weight = -1;
    }

    // Below classes know what classes are above but above classes doesn't know
    // what class properties are below.. that is parent class does not know what is in the
    // child class, But child class does know what is in the parent class

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        // super-->> In order to set the length, height and width, it has to get these
        // values from the parent class, and these values are getting initialized in the
        // parent class.
        // super simply means call the parent class constructor.
        // super can not access those members of the parent class that have been
        // declared private.
        this.weight = weight; // accepts the weight normally
        // this.length = length;
        // this.width = width;
        // this.weight = weight;
        // this.height = height;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

}
/**
 * Super()-->> suppose we have 3 classes->> class A, class B and class c
 * class A{
 * // we can use super() though it does not give an error.
 * class B {
 * super keyword used in B will be referring to A class.
 * class C{
 * super keyword used in C class will be referring to B class.
 * }
 * }
 * }
 */
