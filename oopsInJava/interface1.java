package oopsInJava;
/**
 * class to class-> extends
 * class to interface-> implements
 * interface to interface->> extends
 * 
 */

interface I { // interface says that i will give you the methods that you need, but I will not
              // implement them.Its your job(class) to
    // implement those methods

    // interface is similar to the class, that contains methods abstract and public
    // by default.
    void show(); // also "public and abstract."

    void config();

    // by default every method in the interface is public abstract, so no need to
    // define these 2 keywords.
    // public abstract void show();
   // int age;  // these variables once created are by default final and static
   int age = 23;
   String name = "BLR";

}
// what is the need of the interface=> We can implement multiple interfaces
interface I2{
    void play();
    void sing();
}

// creating a class that will implement the interface methods
class C implements I , I2{  // we can implement multiple interfaces
    // once we implement the interface in class, it becomes mandatory to define all
    // the methods. If we failed to do so, that class
    // is made to be abstract also
    public void show() {
        System.out.println("I am in show:");
    }

    public void config() {
        System.out.println("I am in config");
    }
    // once we implement the interface all its declared methods must be defined
    public void play(){
        System.out.println("I am in I2 interface");
    }
    public void sing(){
        System.out.println("I am in I2 interface also:");
    }
}


public class interface1 {
    public static void main(String[] args) {
        // A obj = new A(); // we cannot create the object of the interface, cannot
        // instantiate the type A
        // now we can create the object of the class using the reference of if interface
        // A

        I obj = new C();
        I2 obj1 = new C();  // In I we dont have methods of I, so it does not know we call those methods using I
        // we need to create the reference of the Interface 2 to create the class of C
        
        obj.show();
        obj.config();
        // since we have variables as by default static, no need to call it by object, just call it directly
      //  I.age = 32;  // can not change because it is by default defined as final
        System.out.println(I.age);
        // I2 interfaces
        obj1.play();
        obj1.sing();
        
    }

}
// why are varaibles defined as final and static in interface:- We cannot implement the variables in java, since these are not 
// implemented they are defined as final. so that no change will occur
