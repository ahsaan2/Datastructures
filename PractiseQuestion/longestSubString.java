package PractiseQuestion;

import java.util.ArrayList;
import java.util.List;

public class longestSubString {
    public static void main(String[] args) {
        // return the length of the longest substring without repeating characters
        String s = "abc";
        System.out.println(lengthOfLongestSubString(s));
    }

    public static int lengthOfLongestSubString(String s) {
        // given a string, we have to find the length of the largest subtring
        /**
         * this problem is solved using the sliding window techiniqe:-A fixed sized
         * window is moved
         * through a data structure, typically an array or string.
         * Stesps:-> We increase our right pointer one by one till the condition is
         * true.
         * At any point, if the condition is not true, we shrink our window size by
         * increasing the left pointer
         * 
         * s = "abcabcbb"
         */
        // here we define a window and add the characters in the list one by one
        int start = 0;
        int end = 0;
        // int end = 3; // so the size of the window that we kept is 3
        // since we have to find the length of the max substring without repeating
        // character
        // we have a max_length variable
        int max_length = 0;
        // creating a list of characters
        List<Character> list = new ArrayList<>();
        // we traverse the string, till the end pointer becomes out of bounds
        while (end < s.length()) {
            // we check if our string has the character at index end,if not then we add and
            // if the character is present in the list, then we remove that character and
            // update the
            // left pointer of the window, that means window gets slided.
            if (!list.contains(s.charAt(end))) {
                // add in the list
                list.add(s.charAt(end));
                end++;
                // now due to the addition of character, maxLength gets changed
                max_length = Math.max(max_length, list.size()); // get the max lenght betwen the two,
                // max_value will always have our largest substring value.

            }
            // now if the character at window size end is present,we remove that from the
            // list and
            // update the window by updating the left pointer
            // that is once start and end pointer in the window have same character, value
            // of start
            // is removed from the list and the window also gets slided.
            else {
                // remove from the list
                list.remove(Character.valueOf(s.charAt(start)));
                // update the window
                start++;
            }
        }
        return max_length;

    }
}
