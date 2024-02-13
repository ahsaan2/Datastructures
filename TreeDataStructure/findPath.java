package TreeDataStructure;

public class findPath {

    // We have a tree and we are given an array, we have to find that if the path or
    // if the array values exists in the tree as a path
    // array [3, 9, 12, 8]

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // we will return true if the path is found and return false, if the path is not
    // found
    public boolean findpath(Node node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0); // first we will have index as 0

    }

    // create the helper function that will take the node, arr, and index
    public boolean helper(Node node, int[] arr, int index) {
        if (node == null) {
            return false;

        }
        // if we are out of index, or if the value is not equal to the value of the
        // index item
        // then we will not have a path
        if (index >= arr.length || node.value != arr[index]) {
            return false;
        }
        // now if we reach till the leaf node through recursive calls , then we will
        // have the path
        if (node.left == null && node.right == null && index == arr.length - 1) {
            // we are at the leaf node
            return true;

        }
        // go to the left and right recursive calls respectively
        return helper(node.left, arr, index +1) || helper(node.right, arr, index=1);
    }

}
