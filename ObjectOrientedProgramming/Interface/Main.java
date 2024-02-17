package ObjectOrientedProgramming.Interface;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // Car car2 = new Car();
        // Car car3 = car2;
        Engine car = new Car();
        // which version to access will be mentioned by the object -->>  new Car();
        // what to access will be mentioned by -->> Engine
        // car.brake();   // not present in engine, will not be accessed
        // the method brale() is undeefined for the type Engine
        car.start();
        car.accelerate();
       // car.play();   // unidentified for Engine
        // System.out.println(car);
        // System.out.println(car2);  
        // System.out.println(car == car2);  // false
        // System.out.println(car3 == car2);  // true
    }
}
/*
 * When we used classes, parent class have no idea about the child classes, but
 * the child class has idea about the parent classes
 * so when we are calling one function from child class and lets say that
 * function exists in the parent class
 * then the parent class and child class both have to be present at the compile
 * time.So that java compiler can check everything is compatible.
 * -->> Interfaces are not like this(hierarchical in classes).
 * 
 */
