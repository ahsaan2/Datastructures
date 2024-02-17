package ObjectOrientedProgramming.AbstractMethods;

public class Main1 {
    public static void main(String[] args) {
        son son1 = new son(30);

        son1.career();
        son1.captain();
        son1.info();
        // we cannot create the objects for abstract class, suppose if we are able to
        // create the object
        // of the abstract class and we call some method, it will give an error, as the
        // method we called does
        // not have any body.
        
    }
}
