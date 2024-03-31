package oopsInJava;

class Human {
    // we declare two variables, and to acheive encaptulation we make them private
    private int age;
    private String name; // we can also assign the values, using set method
    // Encaptulating the age and name.
    // these variables are now only accessible in the same class.

    // so the way that we will be able to access these data is through methods.
    // if you want to know my name, you have to ask for it and I should decide will
    // I share that data with you or not.

    // getter
    // here we are accessing the variables through methods, and no one from the
    // outside world
    // can access these variables, this is known as encaptulation.
    public int getAge() { // getAge is defined in the same class
        // we can access the age variable here , as it is in the same class
        return age;
    }

    public String getName() {  // this will now us return the name, when we call the method
        return name;
    }
    // getter method helps us in getting the information that is set private
    // setter makes us set the information/ data to those variables who are set as private

    // set the values
    public void setAge(int age) { // accepts the value
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        // this keyword can be used to refer current class instance variable. 
    }
}

public class encaptulation {
    public static void main(String[] args) {
        // accessing the class variables
        Human obj = new Human();
        // now we have variables as private, this makes the variables as not visible.
        // obj.age = 11;
        // obj.name = "ahsaan";
        // we can access the variables here , because they are private
        // but what we can do is that we can access the methods, those are public.
        // setting the age now
        obj.setAge(21);
        obj.setName("Ahsaan");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
/**
 * Encaptulation can be said as keeping it close, keeping it
 * Java Encapsulation is a way of hiding the implementation details of a class
 * from outside access and only exposing a public interface that can be used to
 * interact with the class.
 * Encaptulation is acheived by declaring instance variables of a class as
 * private, which means they can be
 * accessed only within the class.
 * To allow outside access to the variables getters and setters are used
 */