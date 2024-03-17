package Java;

import java.util.Scanner;

public class introJava {
    public static void main(String[] args) {
        // ternary operatot ->> ?:
        // if the condition is true then execute the part that is after the question
        // mark and if it is false then execute
        // the part that is after the :
        // -->> if true then do this , if false then do that

        int num3 = 40;
        int result3 = 0;
        result3 = (num3 % 2 == 0) ? 10 : 20;
        System.out.println(result3);

        byte b = 127;
        int a = 257;
        float f = 7.6f;
        int c = (int) f;
        System.out.println(c); // 7
        // b = a; // type mismatch cannot convert from int to byte
        // byte is a small data type and int is larger, while converting we might loose
        // some data
        // so it is not permissible here.
        // this can be done explicitly
        b = (byte) a; // we have to convert the integer a into byte, this is know as
                      // casting(explicitly)
        // 257 % 256 = 1
        // 256 % 256 = 0
        System.out.println(b);
        a = b; // this is an inmplicit conversion(when it is done implicitly).
        System.out.println(a);
        byte i = 127;
        int bb = 259;
        i = (byte) bb;
        System.out.println(i);
        int num = 7;
        int result = num++;
        int num2 = 7;
        int result2 = ++num2;
        System.out.println(result2); // will first increment by 1 and then print
        System.out.println(result); // will first print the num and after that will increment it
        // switch statements
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for a case:");
        int number = input.nextInt();
        input.close();
        // int number = 4;
        switch (number) {
            case 1: // if the vvalue of number is 1,then
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("No accepted match found");
                break;
        }

    }
}
// type conversion-->> changing of one data type into another, can be implicitly
// or explicitly
