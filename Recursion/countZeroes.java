package Recursion;

public class countZeroes {
    public static void main(String[] args) {
        int n = 30204;

        System.out.println(helper(n));
    }

    static int helper(int n) {
        return helper(n, 0); // at first we have a number and the count of the zeroes
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        // we have to check if the last digit is 0 or not
        int rem = n % 10;
        // 30204 % 10 = 3020 count = 0
        // 3020 % 10 = 302 count 1
        if (rem == 0) {
            return helper(n / 10, count + 1);

        }
        return helper(n / 10, count);
    }
}
