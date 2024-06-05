import java.util.Scanner;

interface I {
    void compute(int a);

}

interface B {
    void area(int a, int b);
}

class C implements I, B {
    public void compute(int a) {
        System.out.println("Area of square is" + (a * a));
    }

    public void area(int a, int b) {
        System.out.println("Area is:" + (a + b));
    }

}

public class interface2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth = sc.nextInt();

        C obj = new C();
        // we can not create the object of the interface directly
        obj.area(length, breadth);
        obj.compute(length);
        sc.close();

    }

}
