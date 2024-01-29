package ObjectOrientedProgramming.PrincipleOfOops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circles();
        Triangle triangle = new Triangle();
        Shapes square = new Square();
        // Parent obj = new Child(); -->> Here, which method will be called depends on
        // the type of Child or child class and this is known as upCasting and this
        // entrie thing is known as how overriding happens.

        shapes.area();
        circle.area();
        triangle.area();
        square.area();
        Number number = new Number(12);
        System.out.println(number); // will give only hashvalue if the toString method is not defined
    }
}

/**
 * How java determines with method to run
 * -->> It is determined by the Dynamic Method-Dispatch =>> It is a mechanism by
 * which a call to the overriden method is resolved at the "runt-time "rather
 * than
 * the compile time.When the program is running, its during that time java
 * determines which method to run.
 * Java determines which version of that method to call based on the type of the
 * object.
 * Parent obj = new Child(); -->> this determination happens at the run-time.
 */
class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }
    // create the toString method
    // In java every class extends toString Object
    @Override  // 
    public String toString(){
    return "objectPrint{" +
    "num="+ num+ '}';
    }
}