package ObjectOrientedProgramming.Packages;

// static public class InnerClasses {  -->> Outside classes can not be static, only inner classes can be static
// why 
public class InnerClasses { // this class itself is not dependent on the other classes.

    // Inner classes means that we have classes inside the class
    static class Test {  // create the static, test class itself is dependent on the outer class now
        String name;

        public Test(String name) {
            this.name = name;
        }
        // test is defined as static inside the Inner class hence it is not dependent on the objects of the inner class
    }
    public static void main(String[] args) {
        Test test = new Test("Ahsaan");  
        Test test1 = new Test("danish");
        System.out.println(test.name);   // static
        System.out.println(test1.name);

    }
}
