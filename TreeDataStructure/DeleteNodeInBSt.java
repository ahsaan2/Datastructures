package TreeDataStructure;

public class DeleteNodeInBSt {
    // given the BSt we have to delete a node and return the tree in such a way that
    // the property of the binary search tree is maintained.
     Node root = null;

    class Node {
        Node left;
        Node right;
        int value;
        int data;

        public Node(int value, int data) {
            this.value = value;
            this.data = data;

        }

    }

    // function to delete a node
    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }
        // if we have to delete an element that is less than the root node.
        // we will search in the left-side

        if (key < root.value) {
            root.left = deleteNode(root.left, key);
            // delete the key and return the root of the modified bst
        }
        // if the item is greater than the root node, search in the right-side
        else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            // if the left side is null, then we have to return the right side
            if (root.left == null) {
                return root.right;

            }
            // if the right side is null
            if (root.right == null) {
                return root.left;

            }
            // now if both the item has nodes from both the side
            // we go in the right side of that node, and find the minValue that will replace
            // the deleted node
            root.data = minValue(root.right); // root.data will have the min value, we get from the below function, and
                                              // this is the value that we place in the current root data
                                              // that is the root.data is the replaced value in place of the deleted
                                              // value
            // now we have to remove the value, that we got from the minvalue, that is
            // delete the node
            // that replaced the key value
            root.right = deleteNode(root.right, root.data); // here key is the root.data
        }
        return root;

    }

    // find the min value
    static int minValue(Node root) {
        int min = root.data;
        while (root.left != null) { // min value can be found only in the left side
            min = root.left.value;
            // update the root
            root = root.left;

        }
        return min;
    }
}
/**
 * Cases to delete a node in bst
 * "1". If we have to delete a leaf node(check if the left and right is null, if
 * the left is null then return the right and if right is null then return the
 * left),
 * find the parent of the node first
 * and then make the left/right of the parent as null.
 * 
 * ---------------------------------------------------------------------------
 * 
 * "2". If the item we have to delete is not the leaf node and has children
 * nodes, suppose on the left side, then we have to update the left in such a
 * way that the condition of the bst remains
 * satisfied.
 * 
 *  --------------------------------------------------------------------------
 * 
 * "3".We have to delete a node that is not a leaf node and has children on both
 * the sides, left and right children.
 * Once we reach to the node that is to be deleted we will go in the right
 * sub-tree of that node,
 * and find out the smallest number(will be present in the left most side of
 * that sub-tree(InOrder successor)).
 * -->> Find the smallest number in that subTree-->> we will call that subtree
 * and the smallest item will be found on the left most side of that tree.
 * -->> Now once we find the smallest node, we will replace it with the item
 * that is removed from the tree.
 * -->> The smallestNode we found might have a right node also, we will make that
 * node as the right of the parent node.
 */
