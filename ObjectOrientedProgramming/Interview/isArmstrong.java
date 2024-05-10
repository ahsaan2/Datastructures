package ObjectOrientedProgramming.Interview;

import java.util.Scanner;


public class isArmstrong {
    // the number is said to be armstrong only if the sum of individual multiplier
    // of the number is equal to the number itself
    // example 153 => 1 * 1 * 1 = 1 , 5 * 5 * 5 = 125, 3 * 3 * 3 = 27 -->> 1 + 125 +
    // 27 = 153
    // / therefore it is an armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong number:");
        int n = sc.nextInt();
        System.out.println(isArmstrongNumber(n));
        sc.close();
    }

    static boolean isArmstrongNumber(int n) {
        if (n <= 1) {
            return false;
        }
        // 153
        // first we need to get a single number and its multiplier
        // get last digit
        int sum = 0;
        int original = n; // maintaining the original of the number as original.
        while (n > 0) {
            int lastDigit = n % 10; // 3 , 5
            // now we have got the 3, add the multiplier of 3 in sum
            sum = sum + lastDigit * lastDigit * lastDigit;
            // Iteration 1: 0 + 3*3*3 = 27
            // Iteration 2 : 27 + 5*5*5 = 152 and plus 1 for iteration 3
            // sum = 27
            // sum = 52
            // now we can remove the last digit from n
            n /= 10;
            // n = 15
            // n = 1
        }
        // now we have got the answer in sum, for the sum to be armstrong number we need
        // to check if they are same or not
        if (sum == original) {
            return true;
        }
        return false;
    }

}
