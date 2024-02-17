package ObjectOrientedProgramming.PrincipleOfOops;

public class Main {

    public static void main(String[] args) {

        Student sd = new Student(1, "12"); // values of the constructor is passed here
        System.out.println(sd.id); // 12
        System.out.println(sd.name);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = 12;
        this.name = "danish";
    }
}
