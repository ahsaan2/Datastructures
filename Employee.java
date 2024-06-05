import java.util.Scanner;

public class Employee { // class employee
    // implement class , objects and methods
    int empNo;
    String employeeName;
    float salary;
    float hra;
    float insurance;
    float allowance;

    // creating a constructor for the employee
    Employee() {
        empNo = 0;
        employeeName = "";
        salary = 0;
        hra = 0;
        insurance = 0;
        allowance = 0;

    }

    // creating a method to get the data
    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        employeeName = input.nextLine();
        System.out.println("Enter the id of the Employee");
        empNo = input.nextInt();
        System.out.println("Enter the salary of the employee:");
        salary = input.nextInt();
        input.close();

    }

    // creating a method to calculate pay
    void calculatepay() {
        hra = salary * 0.1f;
        insurance = salary * 0.5f;
        allowance = salary * 0.22f;

    }

    // method to display the data
    void display() {
        System.out.println("Employee Name:" + employeeName);
        System.out.println("Employee ID:" + empNo);
        System.out.println("---------------------------------------------------------------------");
        System.out.println(                          "SALARY SLIP                                  ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Employee Salary is:" + salary);
        System.out.println("The insurance amount of the employee is:" + insurance);
        System.out.println("The hra allowance of the empleyee is:" + hra);
        System.out.println("The yearly allowance of the employee is" + allowance);
    }
    public static void main(String[] args) {
        // creating the object of the employee class
        Employee emp = new Employee();
        // calling the methods using object of the employee
        emp.getData();
        emp.calculatepay();
        emp.display();
    }

}
