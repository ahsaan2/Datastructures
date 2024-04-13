package oopsInJava;

class encaptulationExample {
    private int age;  // instance variable.
    private String name;

    // we create a method to get the age, this method is public and is inside the
    // class only, so it can be accessed in the main method
    public int getAge() {
        return age; // we can access this variable now, outside the method
    }

    public String getName() {
        return name; // can be accessed outside the class now.
    }

    // now we can have another method setter, that can set the values for these
    // methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class thisKeyword {
    public static void main(String[] args) {

        encaptulationExample obj = new encaptulationExample();
        // now we create
       // obj.age = 21;
        // obj.name = "name"; // we are able to access these with the help of object
        // once we create these variables as private, we cannot access them
        // so access these variables we use the methods
        // the above variables are not visible but the methods are visible and those
        // methods contain the same variables
        // set the age and get the age alos
        obj.setAge(21);
        obj.setName("Danish");
        System.out.println(obj.getAge()); // can be accessed here, but we need to set eh age also
        System.out.println(obj.getName());
        

    }

}
// this keyword:-> this keyword is used to refer the current class instance variables.
// it can be used to invoke current class varaible (implicitly)
// this keyword is used to invoke the current class constructor, it is used to reuse the constructor.
