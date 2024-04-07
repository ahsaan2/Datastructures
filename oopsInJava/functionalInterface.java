package oopsInJava;

@FunctionalInterface // checks for only one method, will give error if we have two methods present.
interface InnerfunctionalInterface {
    // should have only one method
    void show();
    // void print();

}
// we need to have a class for creating the object where we can implement
// interface
// class Bb implements InnerfunctionalInterface{
// Bb(){
// System.out.println("Constructor of the class:");
// }
// public void show(){
// System.out.println("I am a functional interface:");
// }
// }
// we do not want to create a class to call the abstract method, but want to
// define, so we use annoymous of a class.

public class functionalInterface {
    // functional interface-->> is an interface that has only one abstract method in
    // it
    // if we want to have an functional interface , we can make use the annotation
    // @FunctionalInterface that
    // will check whether the interface has only one method or not.
    public static void main(String[] args) {
        // Bb obj = new Bb();
        // new Bb();
        // obj.show();
        // instead of creating a class, we are using annonymous of a class

        // Anonymous classes enable you to make your code more concise. They enable you
        // to declare and instantiate a class at the same time. They are like local
        // classes except that they do not have a name.
        InnerfunctionalInterface obj = new InnerfunctionalInterface() {
            // instantiate the interface, by defining its own implementation
            public void show() {
                System.out.println("I am a functional interface:");
            }
        };
        obj.show();
    }
}
