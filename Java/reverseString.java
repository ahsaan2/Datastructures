package Java;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        // reverse a string using stacks
        Stack<Character> stack = new Stack<>();
        String s = "ABCDEF";
        // covert the string into characters
        char[] ch = s.toCharArray();
        for (char c : ch) {
            stack.push(c);

        }
        System.out.println(stack);
        // List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            // list.add(stack.pop());
            // replaces the character in the characters array one by one
            ch[i] = stack.pop();
        }
        System.out.println(ch);
    }
}
