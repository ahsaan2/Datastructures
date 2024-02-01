package ObjectOrientedProgramming;

public class ObjectClass {
    // Object class is the root of the class heirarchy, it is the top most class in
    // the inheritance.
    int num;
    float number;

    public ObjectClass(int num) {
        this.num = num;
    }

    public ObjectClass(int num, float number) {
        this.num = num;
        this.number = number;
    }

    // create a method for hashcode --> hashCode gives us the random integer value
    // of the numbers
    @Override
    public int hashCode() {
        return super.hashCode(); // will override the java hashcode method
    }

    // equals
    // @Override
    // public boolean equals(Object obj) {
    // return super.equals(obj);

    // }
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass) obj).num;
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(12);
        System.out.println(obj.hashCode()); // will give the hashcode integer value of the obj
        ObjectClass obj1 = new ObjectClass(12);
        System.out.println(obj1.hashCode()); // will give us the hashcode integer value of the obj1
        // if the number or value of the objects is same, we get the different hashcode
        // value, because hashcode checks for if the object is same then the hashcode
        // value will be same.
        // for same objects the hashcode value will be same
        ObjectClass demo = new ObjectClass(12);
        // ObjectClass demo1 = new ObjectClass(12);
        ObjectClass demo1 = demo;
        ObjectClass demo3 = new ObjectClass(12);
        if (demo == demo1) { // compares memory reference of the objects in heap
            System.out.println("The memory in the heap for both the objects is same:");
        } else {
            System.out.println("Heap memory is not same for the objects:");
        }
        if (demo.equals(demo3)) {
            System.out.println("The contents of both the objects is same:");

        } else {
            System.out.println("The content of the object is different:");
        }
    }

}
/*
 * == operator & equals() method -->> Both are used to compare the objects in
 * java. == is a operator and equals() is a method
 * == operator compares the reference or the location of the object in the heap
 * memory, whether they point to the same memory.
 * -->> when ever a new object is created using new , it will create a new
 * memory location for that object. so we use == operator to check the memory
 * location of the object if they are same or not
 * -->> If we have to compare the content they posses then we use the equals()
 * method.
 * 
 */
