package TreeDataStructure;

import java.util.Stack;

public class dfsStack {
    public class DFSStack {
        class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
            }
        }
        public void add(int index, int element){
            throw new UnsupportedOperationException();
        }

        // DFS using stack data structure
        void dfsStack(Node node) {
            if (node == null) {
                return;
            }
            // we have to put items in the stack
            Stack<Node> stack = new Stack<>();
            // push the root node into the stack
            
            stack.add(0, node.value);
            // print the value of the root node
            while (!stack.isEmpty()) {
                Node removed = stack.pop();
                System.out.println(removed.value);
                // now when we remove the items we have to add the items in the stack.
                if (removed.right != null) {
                    stack.push(removed.right);
                }
                if (removed.left != null) {
                    stack.push(removed.left);
                }

            }

        }
    }
}
