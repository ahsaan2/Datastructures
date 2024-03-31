package oopsInJava;

class calculator {
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
    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}

public class inheritanceInJava {
    public static void main(String[] args) {
        // calculator obj = new calculator();
        // int addAns = obj.add(12, 12);
        // System.out.println(addAns);
        newCalculator cal = new newCalculator();
        int ans2 = cal.divide(12, 2);
        System.out.println(ans2);
        int ans3 = cal.add(12, 12); // extended property
        System.out.println(ans3);
    }

}
// java supports single level inheritance, multi-level inheritance
// -->> multi-level inheritance=>when we have a class that is getting inherited
// by something else, ans it itself is getting inherited
// by something else.
// (parent(A) --> child(B)(this becomes now parent) --> child).
// -->> Java does not support multiple inheritance.(because of the ambiguity,
// suppose if the two parent class has the same method
// and we call the method. Java gets confused which method to choose.)
// java does not support multiple inheritance

/**
 * what ever property your parents have ,its yours also
 * Use-> if we have the same features present, and we want to use them again and
 * agiain, we need not to add them
 * . we can just use those features where ever we need.
 * 
 */
