package TreeDataStructure;

import java.util.Scanner;

public class BinaryTree {
    class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    BinaryTree() {

    }

    // now for the insertion.
    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    // populate the left and right of the tree
    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter on the left side of the:"+node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value you want to add on the left side of  :" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter in the right side of the:"+ node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value you want to add on the right side of :" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // display
    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, "\t");
        display(node.right, "\t");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
    
}
