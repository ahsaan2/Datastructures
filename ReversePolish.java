
// import StackDataStructure.Stack;
import java.util.Stack;

public class ReversePolish {
    // Reverse polish is a mathematial notation in which operators follow their
    // opeant , first operan comes and then the operator comes
    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };   // 9
        System.out.println(reversePolish(tokens));
        String [] tokens2 = { "4","13","5","/","+"};  // 6
        System.out.println(reversePolish(tokens2));

    }

    static public int reversePolish(String[] tokens) {
        // we will create a stack that will store the items and once we see the operator
        // we remove the items from stack add perform the operations
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            // we traverse the string tokens
            // check if we found any operator we do pop the two items from the stack do the
            // operation and put back the item in the stack
            if (token.equals("+")) {
                int temp = stack.pop();
                stack.add(stack.pop() + temp);
            } else if (token.equals("-")) {
                int temp = stack.pop();
                stack.add(stack.pop() - temp);
            } else if (token.equals("*")) {
                int temp = stack.pop();
                stack.add(stack.pop() * temp);

            } else if (token.equals("/")) {
                int temp = stack.pop();
                stack.add(stack.pop() / temp);
            } else {
                // if all the above conditions fail then we have an integer in the token
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();
    }

}
