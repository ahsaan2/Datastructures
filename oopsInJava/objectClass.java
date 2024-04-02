package oopsInJava;

// Every class in java extends and calls object class.
// All objects including the arrays, implement the methods of this class.
class Laptop {
    private String model; // private means that the variable is visible only and only in this class
    // cannot be accessed in the below class, so if we want to access this then we
    // need to use the getter and setter method
    // getter will get the variable and since we use public specifier, it will then
    // be accessed anywhere.
    int price;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // creating our own toString method
    @Override // is an Annotation, used to generate the error message if the method does not
              // override or implement the method declared
    // in super type
    public String toString() {   // Overrides the main toString() method.
        return "hey";
    }
}

public class objectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.setModel("Lenovo yoga");
        System.out.println(obj.getModel());

        System.out.println(obj); // since, it will call the super class toString() here we have created our own
                                 // toString() method.
        // will give us the package name, class name and some hashcode values.
        // *** Every time we try to print the object , it will call the toString()
        // method
        System.out.println(obj.toString()); // now it will give us hey, not the hashcode
        // toString() --> return the class name, @ and Integer.toHexString(hashCode)
        // oopsInJava.Laptop@36baf30c
    }

}
