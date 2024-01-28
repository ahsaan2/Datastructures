package ObjectOrientedProgramming.Packages;

public class Static {
    // what is the word static-->>
    public static void main(String[] args) {
        Humam ahsaan = new Humam(12, "ahsaan");
        Humam danish = new Humam(12, "ahsaan");
        System.out.println(Humam.population); // 1
        // for ahsaan the population is one and similarly for danish population is 1
        // System.out.println(ahsaan.population); 1
        // now the answer will change since we are using the population in a static way
        // ahsan shall give the population as 2
        // System.out.println(danish.population);
        System.out.println(Humam.population); // 2
        // such properties that are not really releated to objects but are common to all
        // the objects of that class
        // is known as static like population example.

        System.out.println(ahsaan);
        System.out.println(danish);

    }
    // for non static an object is needed of needed

    static void fun() {
        Static obj = new Static();
        obj.message(); // can not make the static reference to the non static method
    }

    void message() { // non static member belongs to an instance
        // fun(); // we can have static method inside the non-static method
        System.out.println("Hello:");
    }
    /**
     * when a memeber is declared static it can be accessed before any of the object
     * of the class is being created.
     * Without actually using the object of the class we can still access these
     * variables, even if we don't create the objects.
     * (2) =>> we can declare both methods and variables as static
     * 
     */
    /**
     * why is main declared as static-->> in order to run anything that is inside
     * the class, and main is inside the class
     * also main is the point where we start our program. But how can we create an
     * object or run the program if main is the very first that is running. Hence,
     * we should be able to run this main function withoud the object is being
     * created and that is why its static (thus if
     * static is not present we have to create an object to run the main)
     * <=>> Non-Static methods can not be referenced frpm the static method, meaning
     * inside a static method we cannot use
     * anything that is not static.
     * =>> we know that something which is not static belongs to an object, hence
     * 
     */
}
// Instance variables are non-static variables that are defined in a class
// outside any method, constructor or block