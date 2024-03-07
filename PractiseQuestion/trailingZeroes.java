package PractiseQuestion;

public class trailingZeroes {
    // given the number we have to find the trailing zeroes it has.
    public static void main(String[] args) {
       int ans = 25;
       System.out.println(trailingzeroes(ans));   // 6
    }
    public static int trailingzeroes(int n) {
        // we keep the counter variable that will give us the number of zeroes by
        // dividing the number by 5
        int count = 0;
        // first trailing 0 is at five, so we find from 5 and greater then 5
        int factorialCounter = 5;
        while (n >= factorialCounter) {   // each time the factorial counter will change
            // factorial counter will always be greater or equal to the n, till that factorial counter
            // we will only have same number of zeroes
            count+= n / factorialCounter;
            // now keep multipling the factorial counter by 5 , to check for the multiples
            // of 5
            // each multiple of 5 or if 5 comes twice in the number we will have addition in
            // the count
            factorialCounter = factorialCounter * 5;
            // n = 5: 5 / 5 = 1
            // n = 9 : 9 / 5 = 1
            // n = 10 : 10 / 5 = 2 ,, n = 14 , 14 / 5 = 2 ,, n = 15 , 15 / 5 = 3
            // n = 20 : 20 / 5 = 4 ,,
            // n = 25 , 25 / 5 = 5 but here is the catch , we have 6 trailing zeroes. till
            // 25 we get five
            // and 25 itself gives us 1 zero, 5 + 1 is 6

        }
        return  count;

    }

}
/**
 * the first trailing zero we will get when the number is 5
 * factorial of 5 is :-> 5 * 4 * 3 * 2 * 1 = 120 that is one zero
 * .. till 5 we have 4! = 4 * 3 * 2 * 1 = 24 no trailing zero
 * so, here we can see that if the number is greater than 5 only then there is a
 * possibility of trailing zero
 * 9! = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 49,140 , that is only one trailing
 * zero
 * 10 ! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 4,91,400 , here we have two
 * traing zero
 * we can see a pattern here that we have one 5 and 2 * 5 that is here we have 2
 * fives
 * // the number of fives wil give us the trailing zeroes
 * 20 => 1 -> 5(1) -> 10(1) -> 15(1) -> 20(4) , so here we have 5 fives, that
 * means we have 4 zeroes
 * >> so to find the number of trailing zeroes a number can have by finding the
 * number of fives it has
 * 
 */
