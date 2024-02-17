package ObjectOrientedProgramming.AbstractMethods;

public class son extends abstractClass { // son has to override the methods present in the parent class
    public son(int age){
        super(age);
    }
    
    void career( ) {
        System.out.println("My name is ahsaan:");
    }

    void info() {
        System.out.println("Ahsaan" + " " + 22);
    }
    void captain(){
        System.out.println("I'm not a captain:");
    }
    

}
