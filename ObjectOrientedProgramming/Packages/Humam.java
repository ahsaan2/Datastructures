package ObjectOrientedProgramming.Packages;

public class Humam {
    int age;
    String name;
    static long population; // these properties that are not related to object but are common to all the
    // all objects of that class are defined as static

    public Humam(int age, String name) {
        this.age = age;
        this.name = name;
        // this.population+=1; --> error-->> the static field should be accessed in a
        // static way
        Humam.population += 1;
    }

    static void message() {
        // System.out.println(this.age);
        // we can" not use this keyword in static context"
        // this actually represents to an object, and static is does not depend on the
        // object, so how can we use
        // something that depends on the object with something that does not depend on
        // the object
    }
    // long population;
}
