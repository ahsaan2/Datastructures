package StackDataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // int low = 100;
        // int high = 300;
        System.out.println(sequentialDigits(100, 300));
        
    }
    public static List<Integer> sequentialDigits(int low, int high) {

        // declare a list to keep the answer
        List<Integer> list = new ArrayList<>();
        // sequential digits will start from 1 and till 9
        for (int i = 1; i < 10; i++) {
            // check for the next digits from the i till 9
            // keep the next digit in the varaible
           int next_digit = 0;
            for (int j = i; j < 10; j++) {
                // our current number is zero
              
                // we first need to get 1, we will keep multiplying the next digit with 10 and
                // add the next digit
                // 0 * 10 + 1 --> 1
                next_digit = next_digit * 10 + j;
                if (next_digit >= low && next_digit <= high) {
                    list.add(next_digit);
                } else if (next_digit > high) {
                    // this break statement will get us out of the inner for loop
                    break;
                }

            }
        }
        Collections.sort(list);
        return list;
    }
}
