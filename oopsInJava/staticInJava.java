package oopsInJava;

class Mobile {
    // here we will look at the static keyword

    String brand;
    int price;
    // if we want to make the name variable common to all the objects we can use
    // static
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    Mobile() {
        // constructor for mobile is used for initializing the instance variables that
        // we have
        brand = "";
        price = 123;
        System.out.println("present in the  constructor:");
        // name = "name"; // since this is static and does not change.
        // each time we call the contructor name variable gets initialized , so to
        // remove or
        // avoid the initialization of the name varaible continuosly we put it into a
        // static block
    }

    static { // static block , used to initialize the static variables.
        name = "name";
        System.out.println("in static block:");
    }
    // we can see that constructor is called 2 times and static is called only once,
    // also static is called first.
    // First our class loads and then our object gets instantiated.and every time we
    // load a class it calls the static block first.
    // if we do not create the object no constructor will get called. and it will
    // not load the class as well

    // static methods
    // if we have a static method, we need not to create the object of it
    public static void print() {
        System.out.println("I am static method, dont create object");
    }

    public class staticInJava {
        public static void main(String[] args) {
            // If we want to load the class without creating the object
            // and for that we have a special class inside java called as
            // class Class.forName(className);
            // Class.forName("Mobile"); // forName is a method which loads your class

            Mobile obj = new Mobile();
            obj.brand = "apple";
            obj.price = 12345;
            // obj.name = "smart phone";
            Mobile.name = "smart phone";

            // static variables shoul be called with their class name. not by their object
            // name
            // creating another object for the same mobile
            Mobile obj2 = new Mobile();
            obj2.brand = "Samsung";
            obj2.price = 213242;
            // obj2.name = "m21";
            Mobile.name = "m21";

            // obj.name = "phone";
            Mobile.name = "phone";

            // static variables are basically shared by all the objects.
            // print
            obj.show(); // values of object 1
            obj2.show(); // values of object 2
            Mobile.print();
            // we can call static methods, variables directly with the help of class Name
        }
    }
}