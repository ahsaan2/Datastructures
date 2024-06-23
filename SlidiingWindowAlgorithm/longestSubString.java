package SlidiingWindowAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class longestSubString {
    public static void main(String[] args) {

        // String s = "abcabcbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubString(s));

    }

    static int lengthOfLongestSubString(String s) {
        // we ccan create a list, that will store our character, and keeps track if the
        // character is already appeared or not
        List<Character> list = new ArrayList<>();
        // now declaring points
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < s.length()) {
            // if the charater we are at, is not present in the list, we will add it in the
            // list, and then check for the
            // maxLength
            if (!list.contains(s.charAt(right))) {
                // add in the list then
                list.add(s.charAt(right));
                // list => a,b,c
                // now we have the maximum length one of the maxLength and the size of the list
                maxLength = Math.max(maxLength, list.size());
                right++;
            }
            // here we are at the character a , and a is already present in the list, so 
            else{
                list.remove(Character.valueOf(s.charAt(left)));
                // removee the character at the left index, since the right index value here co-insides with the right index value
                // uppdate the left indx
                left++;
            }
        }
        return maxLength;
    }
}
