package ObjectOrientedProgramming.PrincipleOfOops.Polymorphism;

public class MethodOverloading {
    // Throuh Method Overloading java does the compile time polymorphism
    // name of the method should be same but the number of the arguments should be
    // different.Also order of the type can be different.
    // int sum(int a, int b) {
    // return a + b;
    // }
    void sum() {

    }

    double sum(double a, int b) { // this constructor gets called if the above constructor with both the int
                                  // parameter is commited and if this constructor is commited then the above
                                  // constructor will be called.

        return a + b;
    }

    int sum(int a) {
        return a;

    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj); // will take the default constructor of java and it will give class name with
                                 // hashvalues
        MethodOverloading obj1 = new MethodOverloading();
        // obj.sum(12,12,12,12);
        System.out.println(obj1.sum(12, 10));
    }
}
