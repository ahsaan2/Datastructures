package oopsInJava;

class demo {
    void show() {
        int num = 9;
        System.out.println(num); // we will get 9 here
        num = 10;
        System.out.println(num); // 10 here
        // now if we make the variable final
        final int num2 = 15;
        System.out.println(num2); // 15
        // now changinf num2
        // num2 = 20;
         // shows error message as final variable num2 cannot be assigned.
        // this means that once we declare a variable final, we cannot reassing the
        // value again to that variable
        System.out.println(num2);
    }
}
// final keyword for the methods now.
class calculator1{
    void show(){
        // final void show(){
        System.out.println("I am in normal calculator:");
    }
}

class advancedCal extends calculator1{
   public void show(){   // this can not override the show method now.
        System.out.println("I am in advanced calculator:");
    }
}
// methods and variables defined as final can not be overriden
public class finalLKeywod {
    // final keyword can be used on variables , methods.
    // final makes the variables as constant and no change will occur to that
    // variable
    public static void main(String[] args) {
        demo obj = new demo();
        // calculator cal = new calculator();
        advancedCal cal = new advancedCal();
        // cal.show();  // method overriding, methods with two same name
        // to stop method overriding , we can make our method as final
        cal.show();  

        obj.show();
        // cal.show();
    }
}
