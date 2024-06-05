package oopsInJava;

public class strings {
    public static void main(String[] args) {
        String name = new String("Ahsaan"); // creation of the string object.
        String name1 = "Danish";
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name.hashCode()); // gives us the hashcode
        // checking the strings
        String s1 = "Hello";
        String s2 = "Hello";

        // for both the s1 and s2, they are references and both point to "Hello" as we
        // do not create a new object.
        // Here we check in the String contant pool space in the heap memory, for do we
        // have Hello already there or not.
        // to check if they are same
        System.out.println(s1 == s2);
        // Inside the JVM we have a special constant area called as String Constant
        // pool.
        // Every string we create we cannot change it once we create.
        s2 = s2 + " hii"; // here we change the reference of the s2, and now s2 will point to the new
                          // memory space created in the heap
        // here we are changing the address, and not changing the actual area.
        // the s2 object is now eligible for Garbage collection.
        System.out.println(s2);

    }
}
/**
 * Strings in java are Immutable.Once we create the objets we cannot change it.
 * To have mutable strings, we have two different classes in java.
 * 
 */