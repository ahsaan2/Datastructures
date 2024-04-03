package oopsInJava;

abstract class Car {
    // It is not compulsory to have abstract methods in the abstract class.
    public abstract void drive();

    // we defined the method here, but we are not implementing anything here.
    // so, what we can do is that we will remove the curly braces and put a
    // semicolon at the end, and let
    // some one else define it
    // -->> so, if we only have to declare a method and not defining or providing a
    // body to it , we can create
    // it as abstract
    // But once we define the abstract method, we need to define the class also as
    // abstract.
    public abstract void start(); // we can have multiple abstract methods in the abstract class.

    public void playMusic() {
        System.out.println("I play the music:");
    }

    // this method will not be defined in the wagonR
    public abstract void fly();
}

abstract class wagonR extends Car { // If we are extending a abstract class we need to define the methods of the
    // abstract class.
    // wagonR knows how to drive
    public void drive() {
        // so, here we can define it
        System.out.println("I know how to drive the car");
    }

    public void start() {
        System.out.println("I can start the car:");
    }
}
// in abstract class the class that is not abstract is called concreate class, and we can create object of the concreate class only

class updatedWagonR extends wagonR { // we have to create the object of updatedWagonR now
    public void fly() {
        System.out.println("A car cannot fly:");
    }
}

// it is compulsory to define all the abstract methods.If we do not implement
// all the methods of the abstract class, we get a compile
// error and to remove that we make that class also abstract. But the problem is
// we cannot create object of the abstract classes.
// so we create another class and extend these methods

// Abstract methods are only defined by the abstract class.

public class abstractMethods {
    public static void main(String[] args) {
        // Car car = new Car(); // we can't create object of the abstract class.
        // we can create the reference of the abstract class.
        // Car obj = new wagonR(); // once wagonR gets declared as abstract, we cannot
        // create object of that class now
        Car obj = new updatedWagonR();

        obj.drive();
        obj.playMusic();
        obj.start();
        obj.fly();
    }

}
/**
 * Abstract methods:->Declared with the keyword abstract.Abstract classes can
 * not initiated.
 * We declare an abstract method without any implementation.
 * Methods in interface that are not defined static or default, are implicitly
 * abstract.So,the abstract keyword is not used with the abstract methods.
 */
