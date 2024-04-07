package oopsInJava;

import oopsInJava.mainClass.innerclass1;

// annotations which work at the class level
@Deprecated // means you can use it , but don't use it.
class mainClass { // static can not be used here.
    int age;

    public void show() {
        System.out.println("I am in the main class:");
    }

    class innerclass {
        public void config() {
            System.out.println("I am in the inner class of the main class:");
        }
    }

    static class innerclass1 {
        void print() {
            System.out.println("I am static inner class:");
        }
    }

}

public class innerClass {
    public static void main(String[] args) {
        mainClass obj = new mainClass(); // this obj is also used for creating the obj of the inner classes.
        // we cannot create direct object of the inner class, since inner class is
        // present in the main class. we use the . to the inner class
        // for object creation.
        mainClass.innerclass obj2 = obj.new innerclass(); // inner class is in the main class
        // to create the new object of the inner class, we need the object of the outer
        // class first.
        // --> If we have the inner class as static we do not need to use object of the
        // outer class first while creating the object
        mainClass.innerclass1 obj3 = new innerclass1(); // no need of the obj of mainclass.
        obj3.print();

        obj.show();
        obj.age = 21;
        System.out.println(obj.age);
        obj2.config();

    }

}
