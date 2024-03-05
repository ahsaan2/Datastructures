package PractiseQuestion;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    // we are given an integer n, if i is divisible by 3 -> fizz
    // if i is divisible by 5 -> buzz
    // if by both print fizz buzz
    // if ans[i] = i, that is if the i is not divisible by the above numbers
    // we have to print the i in string
    // converting integer to string. parsetoString
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        // n = 5 , i =1,2,3,4,5
        for (int i = 1; i <= n; i++) {
            // condition 1
            if (i % 3 == 0 && i % 5 == 0) {
                // we have to add the fizz to list
                // i = 1 2 3 4 5
                // ["1", "2", "fizz","4","Buzz"]
                list.add("FizzBuzz");

            }
            // condition of buzz
            else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) { // at 15
                list.add("Buzz");
            }
            // now according to the question, if all the above condition fails
            // we have to add i into the list as a string value,
            // to convert integer to string. we use Integer.toString()
            else {
                //
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
