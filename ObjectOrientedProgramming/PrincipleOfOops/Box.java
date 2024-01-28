package ObjectOrientedProgramming.PrincipleOfOops;

public class Box {
    // create a class Box

    double length;
    double height;
    double width;

    // constructor for Box
    Box() {
        super(); // does not refer to anything here, because it is in the parent class
        // Every class has object as a super class.
        // -->> super>>=> call the constructor to call the Object class

        this.length = -1;
        this.height = -1;
        this.width = -1;

    }

    // create a shape of cube
    Box(double side) {

        this.length = side;
        this.height = side;
        this.width = side;
    }

    // create another constructor that takes all parameters
    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // copy constructor
    Box(Box old) {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;

    }
}
