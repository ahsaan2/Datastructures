package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        //  1342 -->> 10
        int n = 1342;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }
}
