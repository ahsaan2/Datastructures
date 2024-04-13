package oopsInJava;

class calculator {
    calculator() {
        // super(); // calls the object class, we we mention super() here or not.
        System.out.println("I am the parent class of calculator:");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
// public class calu{
// // we can have only 1 public class in the java file, if we have another one
// it will show us an error as : public must be defined
// // in its own file
// }

class newCalculator extends calculator {
    newCalculator() {
        // super keyword must be always the first statement in the constructor
        super();
        System.out.println("I am in the child class of calculator:");

    }

    public int divide(int a, int b) {

        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    // if we create another class that will extend the class calculator, then we
    // will have hierarchical inheritance(that is two or more class inherit the same
    // class.)
}

public class inheritanceInJava {
    public static void main(String[] args) {
        // calculator obj = new calculator();
        // int addAns = obj.add(12, 12);
        // System.out.println(addAns);
        newCalculator cal = new newCalculator(); // once we create the object of the class, it will first call the
                                                 // constructor of that
        // class and because of super keyword the execution of the program will keep on
        // going to the upper or paent class.
        int ans2 = cal.divide(12, 2);
        System.out.println(ans2);
        int ans3 = cal.add(12, 12); // extended property
        System.out.println(ans3);
        int ans4 = cal.sub(10, 5);
        System.out.println(ans4);
    }

}
// java supports single level inheritance, multi-level inheritance
// -->> multi-level inheritance=>when we have a class that is getting inherited
// by some other class and, that class is itself getting inherited
// by some other class.
// (parent(A) --> child(B)(this becomes now parent) --> child).
// -->> Java does not support multiple inheritance.(because of the ambiguity,
// suppose if the two parent class has the same method
// and we call the method. Java gets confused which method to choose.)

/**
 * what ever property your parents have ,its yours also
 * Use-> if we have the same features present, and we want to use them again and
 * agiain, we need not to add them
 * . we can just use those features where ever we need.
 * 
 */
