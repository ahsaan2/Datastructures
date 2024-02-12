package TreeDataStructure;

public class DepthFirstSearch {
    /**
     * It is the top to bottom approach of searching in the tree.
     * This algorithm includes the 3 types of the traversals or ways in which you
     * are exploring the tree.
     * 
     */
    private Node root;

    public DepthFirstSearch() {

    }

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }

    }

    // First traversal method is
    // preorder traversal
    public void preOrder() {
        preOrder(root);

    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        // in pre order --> we first have the root node and then the left and after that
        // we have right node
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

    }

    // In-order traversal(left-most first) -->> In a BSt when we want the lowest
    // value, in that case use it.
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        // first we will have left node
        inOrder(node.left);
        // then the root and then right
        System.out.println(node.value);
        inOrder(node.right);

    }

    public void postOrder() {
        postOrder(root);
    }
    // used when if we have to perform the function on the root node last, suppose
    // if we have to delete the tree, in that case
    // we have to first delete the left subtree first and then the right sub tree,
    // after that we have to delete the root node
    // therefore we use this traversal method in deleting a tree.

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        // first we will have left and then right, and at the last we will have root
        // node
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);

    }

}
