package Java;

public class BSt {
    private Node root;

    public class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

    public void insert(int value) {
        root = insert(root, value);
    }

    // insert a node
    private Node insert(Node root, int value) {
        if (root == null) {
            // create a node and make it as root
            root = new Node(value);
            return root;
        }
        // now for the left subtree
        if (value < root.value) {
            // fill the left subtree
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
        

    }

    public static void main(String[] args) {
        BSt bst = new BSt();
        bst.insert(12);
        bst.insert(3);
        bst.insert(5);
        bst.insert(35);
        bst.insert(7); 
        bst.insert(55);
        bst.inOrder();

    }

}
