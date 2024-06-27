package Recursion;

public class skipString {
    public static void main(String[] args) {

        String s = "helloAppleehh";
        // skipp the string "apple"
        System.out.println(skip(s));
    }

    static String skip(String original) {
        // if we reach at the end , where the string gets empty then we just return it
        if (original.isEmpty()) {
            return "";
        }
        // now if we are the required string, we have to skip as mant as those
        // characters
        if (original.startsWith("Apple")) {
            return skip(original.substring(5));
        } else {
            // we add the character , and get teh answer from the recursive call
            return original.charAt(0) + skip(original.substring(1));
        }
    }
}
