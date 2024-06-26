package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    static int fact(int n) {
        // if the n is 1 , just return it
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
