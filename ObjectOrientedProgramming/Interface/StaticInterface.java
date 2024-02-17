package ObjectOrientedProgramming.Interface;

public interface StaticInterface {
    // static void greeting();
    static void greet() {
        System.out.println("Hello:");
    }

    default void fun() {
        System.out.println("I am in staticInterface");
    }

}
// static interface should always have a body__>>
// we can not override the static methods.
