package Recursion;

public class skipCharacter {
    public static void main(String[] args) {
        // we are given the string , and we have to return the ans without having that
        // characters in it
        String s = "baccad";
        skip("", s);
        System.out.println(skip(s));

        // we remove the character a , and print the result

    }

    // we can pass 2 arguments in the function and as original string and the answer
    // the base condtition becomes when the original string becomes empty.
    static void skip(String ans, String original) {
        // now if we get the original string empty then we have got the answer
        if (original.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // now get the character at indexes from original string
        char ch = original.charAt(0);
        // now at every function call, we have 2 options either we take it or not,
        // if the character we are at is the character that we need to remove, then we
        // do not add it in the answer
        // and if the character that we are at is not the character that we need then we
        // will not add it in the answer
        if (ch == 'a') {
            skip(ans, original.substring(1));
        } else {
            skip(ans + ch, original.substring(1));
        }
    }

    // Approach 2 , we pass only the original string and we return the empty string.
    static String skip(String original) {
        // if the string becomes empty , we simply return it
        if (original.isEmpty()) {
            return "";

        }
        char ch = original.charAt(0);
        // here at every function call , we are going to check if the character we are
        // at is 'a' , then we are not going
        // to take it , and if the character is not 'a' , then we are going to take that
        // character and whatever the answer we are getting
        // from the function call
        if (ch == 'a') {
            return skip(original.substring(1));

        } else {
            return ch + skip(original.substring(1));
        }

    }
}
