package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        // reverse a string using stacks
        Stack<Character> stack = new Stack<>();
        String s = "ABCDEF";
        for (char ch : s.toCharArray()) {
            stack.push(ch);

        }
        System.out.println(stack);
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(stack.pop());
        }
        System.out.println(list);
    }
}
