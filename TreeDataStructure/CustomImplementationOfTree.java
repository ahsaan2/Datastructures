package TreeDataStructure;

import java.util.Scanner;

public class CustomImplementationOfTree {
    /**
     * we will insert a root node and then we can make a check, do you want to
     * Insert on the left of the node till this check gets failed and we will have
     * another check that says do you want to add on the right side of the node.
     * 
     */
    public CustomImplementationOfTree() {

    }

    // we will have one root node
    private Node root;

    // this root node will be the first node of the tree
    // we will have a class of Node that will have the left, right and the value of
    // the node
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;

        }
    }

    // populate the root node first
    public void populate(Scanner scanner) { // it will take input from the user
        // the first item to be diaplayed will be the root node
        // get the value and make a node for that value
        System.out.println("Enter the root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        // now populat the root recursively, it will have the left and right
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        // it should ask do you wanna insert node to the left of the root node
        System.out.println("Do you want to insert node to the left of: " + node.value);
        // here we will be having two choices either yes or no
        // so we create a boolean for that matter
        boolean left = scanner.nextBoolean();
        // if true then populate the left recursively
        if (left) {
            System.out.println("Enter the value you want to add on the left of the:" + node.value);
            int value = scanner.nextInt();
            // create the left node
            node.left = new Node(value);
            // now populate the left of the tree recurively
            populate(scanner, node.left);

        }
        // if you do not want to insert on the left side then you can add on the right
        // side
        System.out.println("Do you want to add on the right of the:" + node.value);
        // creating again choice for the right side
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value you want to add on the right side of" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            // now populate the right of the tree recursively
            populate(scanner, node.right);
        }

    }

    // creating a display function
    // the first and for most item will be the root
    public void display() {
        display(this.root, "");
    }

    // private void display() {
    // display();
    // }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        // get the root of the tree and then the left sode and the right side
        System.out.println(indent + node.value);
        // now populate the left and right
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

}
