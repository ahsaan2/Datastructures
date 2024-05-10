package ObjectOrientedProgramming.Interview;

import java.util.Scanner;


public class isPrime {
    // prime numbers are those numbers that are divisible by 1 and the number
    // itself.
    // 1 2 3 4 5 6 7 8 9
    // 1/1 =0, 2 /2 =0, 3/3 = 0. 4 /2 and 4 (not a prime)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for the prime or not:");
        int n = sc.nextInt();
        System.out.println(isprime(n));
        System.out.println("Enter another number to check for prime or not:");
        int n1 = sc.nextInt();

        System.out.println(isprime(n1));
        System.out.println("The answer for method 2 prime or not is:");
       System.out.println(prime(83));
        sc.close();

    }

    static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // System.out.println("The number is not prime:");
                return false;
            }

        }
        return true;

    }

    static boolean prime(int n) {
        if (n == 1) {
            return false;
        }
        int c = 2;
        while (c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;

        }
        
        return true;
    }

}
