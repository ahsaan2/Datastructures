package Java;

public class palindromeString {
    // we are given a string we have to find whether the string is palindrome or not
    // A palindrome is a string where we can read the string same from the start and
    // same from the end to start
    public static boolean palindrome(String name) {
        // now we can create two pointers, one pointer will point to the start and
        // another pointer
        // will point to the end of the string
        int start = 0;
        int end = name.length() - 1;
        // now traversing the string
        while (start < end) {
            // now we can directly check for the character at start index and the end index,
            // if the characters are same then increase the start and decrease the end.
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    // using the character array method
    public boolean ispalindrome(String name) {
        // we convert the entire string into the array of characters
        char[] charArray = name.toCharArray();
        // string name gets converted onto the character array and that character array
        // is stored
        // in the charArray
        // now we can check for each character array
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            // if character array at index start is not equal to the character array at
            // index end
            // we will not have a paindrome string
            if (charArray[start] != charArray[end]) {
                return false;

            }
            // increase the start and decrease the end
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        palindromeString obj = new palindromeString();

        String name = "MADAM";
        // palindrome(name);
        String name2 = "radar";
        System.out.println(palindrome(name));  // true
        // boolean ans = obj.palindrome(name);
        // System.out.println(ans);
        boolean ans = obj.ispalindrome(name2);  // true
        System.out.println(ans);

    }
}
