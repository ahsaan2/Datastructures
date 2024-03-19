package oopsInJava;

class calculator {
    // just outside the methods, and inside the class we can have variables
    int a;

    public int add(int num1, int num2) { // accept the values that are provided
        int result = num1 + num2;
        return result;

    }
    // each class has 2 things, properties and methods

}

public class objects {
    public static void main(String[] args) {
        // how do we call the methods, we call by creating an object of the class, where
        // it is present
        calculator cal = new calculator();
        int ans = cal.add(3, 4); // pass the values to be added
        System.out.println(ans);
    }

}
/**
 * Object -->> everything in java is recongnized by the object, and to design
 * the
 * object in a particular way we have a class which will act as a blue print for
 * someone who will
 * create object for you.
 * "who creates object in java -->> It is the JVM that creates the object."
 * It's JVM who says that it's my job to get a object, but you give me a
 * blueprint. so, we create a class file and this class file gets compiled to
 * create a byte code
 * and that byte code goes to the JVM and that's where we get the object.
 */
// JRE-->> Java runtime Environment-> validates the byte code, here we will be
// having all the extra
// files extra classes. 
// JVM is a part of JRE.
