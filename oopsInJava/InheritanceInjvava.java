package oopsInJava;

class A extends Object {
    A() {
        super(); // we dont have any class above here , so why do we use this super here
        // because every class in java extends Object class
        System.out.println("I am in constructo A"); // will call this constructor because of super
    }

    A(int a) {
       super();  // used to refer to the immediate parent class object.
        System.out.println("int a");
    }
}

class B extends A { // Object of B will also call the constructor of A, as A is in B
    public B() {
        // Every constructor has a method in java, even if we do not mention it,that
        // method is called super()
        super();
        System.out.println("I am in constructor B");
        // so, this method executed the constructor of the same class, super method executed the constructor of the super class
    }

    B(int a) {
        // super(a); // will call the super constructor, of parameterized type.
        this();  // will execute the constructor of same class.

        System.out.println("int B");

    }

}

public class InheritanceInjvava {
    public static void main(String[] args) {
        B obj1 = new B(1);
        // B obj = new B();
        // when we call the default constructor, it will go first to B default
        // constructor
        // and there we have the super(), so it will go to the parent constructor and
        // call the default constructor there first
        // will call the constructor that has no parameters
        // when ever we create the object of the class, it will call the constructor of
        // that class
        // so we will have the output here.(I am in constructor B)
    }
}
