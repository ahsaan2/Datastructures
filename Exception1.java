import java.util.Scanner;


class myException extends Exception {
  public myException(String message){
    super(message);
  }
}

class Student {
    String name;
    String usn;
    int m1, m2, m3;

    void avgMarks() {
        try { // try-block will have the critical code that can throw an exception.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the student:");
            name = sc.nextLine();
            System.out.println("Enter the usn of the student");
            usn = sc.nextLine();
            System.out.println("Enter the m1");
            m1 = sc.nextInt();
            System.out.println("Enter the m2");
            m2 = sc.nextInt();
            System.out.println("Enter m3");
            m3 = sc.nextInt();
            sc.close();
            if (m1 < 40 || m2 < 40 || m3 < 40) {
                throw new myException("Provide marks greater than 40:");
            }
            System.out.println("Average marks are:" + (m1 + m2 + m3) / 3);

        } catch (Exception e) {
            System.out.println(e);

        }
      
    }
}

public class Exception1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.avgMarks();
    }

}
