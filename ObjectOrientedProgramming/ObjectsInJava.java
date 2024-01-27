package ObjectOrientedProgramming;



public class ObjectsInJava {
    public static void main(String[] args) {
        // Student[] student1 = new Student[5];
        Student ahsaan = new Student();
        // Constructor-->> defines what happens when the object is created.
        // Constructor is special function that runs when we create an object and it
        // allocates some varibales.
        // By default it does not have arguments -->> We provide the arguments
        System.out.println(ahsaan.roll); // default is 0 
        // System.out.println(student1);
        System.out.println(ahsaan.name); // default is null
        // accessing using dot
        // ahsaan.roll = 13;
        System.out.println(ahsaan.roll);
        System.out.println(ahsaan.marks);
        System.out.println(ahsaan.name);
        Student2  rahul = new Student2();
        System.out.println(rahul.rollNo);
        System.out.println(rahul.name);
        Student random = new Student("random", 11);
        System.out.println(random.roll);

    }

}
class Student2{
    int rollNo;
    String name;
    float marks;
    // constructor for student 2
    // this-->> when ever we try to access the particular item of the class via its object 
    // we use this keyword
    Student2(){
        this.rollNo = 21;   // rahul.rollNo is
        this.name = "Rahul";  // rahul.name is
        this.marks = 12;
    }
}

class Student {
    int roll; // integers default value is 0
    String name; // Objects default value is null
    float marks = 99;

    // create a constructor to the student
    // we need a way to add the values of the above properties object by object
    // we need one word to access every object
    
    Student (){   // return type is the class itself --> constructors do not have a return type
        // when we say student ahsaan = new student --> we need it to automatically replace this particular space 
    // with ahsaan
    // when we want to put any name of the student we automatically want to put it here
    // we use this keyword--> means when we are calling this thing

        this.roll = 13;   // ahsaan.roll is this
        this.name = "Danish"; // ahsaan.name is this
        // constructor calling another constructor
    

    }
    
    Student(String name, int roll){   // constructor overloading
        this.name = name;
        this.roll = roll;
    }
   
}



// what is constructor overloading-->> we have two constructors of the same name that is student
// But here in one we pass the arguments and in other we do not pass the arguments that is known as
// constructor overloading

