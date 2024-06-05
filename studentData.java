public class studentData {
    // Implement a constructor and method overloading
    String name;
    int id;
    int age;

    // creating a constructor for the student data
    studentData() { // this is known as default constructor
        name = "Ahsaan";
        id = 20;
        age = 23;
    }

    void print() {
        System.out.println("The name of the student is:" + name);
        System.out.println("The id of the student is:" + id);
        System.out.println("The age of the student is:" + age);
    }

    // creating a parameterized constructor
    studentData(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    // creating a method 1
    void calArea(float a){
        float area = a * a;
        System.out.println("The area of the square is:"+ area);

    }
    void calArea(int a , int b){
        float area = a * b;
        System.out.println("The area of the rectange is:"+ area);
    }


    public static void main(String[] args) {
        System.out.println("Default constructor:");
        studentData obj = new studentData(); // should call the default constructor first
        obj.print();
        System.out.println();
        System.out.println("Parameterized constructor:");

        // calling the parameterized constructor
        studentData obj1 = new studentData("Ahsaan", 60, 22);
        obj1.print();
        obj.calArea(12);
        System.out.println("Method Overloading:");
        obj.calArea(12, 10);
    }
}
