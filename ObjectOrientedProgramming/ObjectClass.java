package ObjectOrientedProgramming;

public class ObjectClass {
    // Object class is the root of the class heirarchy, it is the top most class in
    // the inheritance.
    int num;
    float number;

    public ObjectClass(int num, float number) {
        this.num = num;
        this.number = number;
    }

    public ObjectClass(int num) {
        this.num = num;
    }

    // create a functions for hashcode
    @Override
    public int hashCode() { // hashcode gives us some random integer value.
        return super.hashCode(); // will override the parent hashcode function
    }
    // @Override
    // public boolean equals(Object obj){
    // return super.equals(obj);
    // }

    /// equals
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass) obj).num; // casting, it will now check for the content
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(1);
        // print the hashcode value for first object
        System.out.println(obj.hashCode()); // it will give us some random integer value
        ObjectClass obj1 = obj;
        // same objects will give us the same hashCode values but for the different
        // objects we will get different values
        System.out.println(obj1.hashCode());
        ObjectClass demo = new ObjectClass(12);
        ObjectClass demo2 = demo;

        if (demo == demo2) { // this check whether these variables are pointing to the same object or not
            System.out.println("The reference of both the objects is same:");
        }

        if (demo.equals(demo2)) { // check the content of these objects
            System.out.println("Both are objects have the same content present");
        } else {
            System.out.println("Content is not equal:");
        }
        // both the if conditions are false
    }

}
/**
 * Both equals() method and == are used to compare two objects in java. But ==
 * operator compares reference or memory location of objects in the heap,
 * whether they point to the same location or not.
 * // if we compare two same objects with the == operator then we get a true ,
 * but we have to compare the content they posses is same then we use .equals()
 * method
 */
