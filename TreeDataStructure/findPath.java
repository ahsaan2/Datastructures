package TreeDataStructure;

public class findPath {
    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    // We have a tree and we are given an array, we have to find that if the path or
    // if the array values exists in the tree as a path
    public static void main(String[] args) {

    }

    boolean findpath(Node node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(root, arr, 0);

    }

    boolean helper(Node node, int[] arr, int index) {
        if (node == null) {
            return false;
        }
        // if index becomes out of bounds or node value is not equal to the index value
        if (index >= arr.length || node.value != arr[index]) {
            return false;
        }
        // return true if we are the leaf node
        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;

        }
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }

}
