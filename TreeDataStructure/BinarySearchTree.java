package TreeDataStructure;

public class BinarySearchTree {
    /**
     * Binary search tree follows some order to arrange the elments.
     * here the value of the left node is less than the value of the parent node and
     * the value of the right node is greater than the value of the parent node
     * the child nodes must be also in the same order.
     */
    /**
     * ---- ADVANTAGES OF THE BINARY SEARCH TREE -----
     * 1. Searching in the Binary Search Tree is easy as we always have a hint that
     * "which subtree has the desired element".
     * 2. As compared to Array and Linked list the Insertion and Deletion operations
     * are faster in BST.
     */
    /**
     * ------Suppose the data elements are - 45, 15, 79, 90, 10, 55, 12, 20,
     * 50--------
     * First, we will insert the 45 as root node
     * Then we will check if the next element is less then the root node and we
     * insert it as left child(15), ans move to the next element.
     * Otherwise, if the element is larger we insert it in the right side of the
     * root node(79).
     */

    // Balanced tree-->> Height of any two nodes should be less than equal to 1.
    public BinarySearchTree() {

    }

    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

    }

    public int height() {
        return height(root);
    }

    // height of the tree
    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return isEmpty(root);
    }

    // check if the tree is empty or not
    private boolean isEmpty(Node node) {
        return root == null;
    }

    // check if the tree is balanced or not
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        // if the node is null
        if (node == null) {
            return true;
        }
        // check for the balanced, ge the absolute height first of the root node and the
        // sub nodes of the tree
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);

    }

    // create the insert
    public void insert(int value) {
        root = insert(root, value); // root node of the tree will give us the entire tree
    }

    private Node insert(Node node, int value) {
        // if we find the null, then we create a new node that is to be added
        if (node == null) {
            // create a new node
            node = new Node(value);
            return node;
        }
        // check if the node is to be added on the left side
        if (value < node.value) { // if value that is now present is less the the node value then insert at the
                                  // left side
            node.left = insert(node.left, value);
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }
        // as we keep on adding the nodes, the height of the tree is changed
        node.height = Math.max(height(node.left), height(node.right) + 1);
        // return the node that gets connected and this will get at last from the
        // function call we have , insert
        return node;

    }

    // populate the tree providing the array
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // keep inserting the nums at index i
            this.insert(nums[i]);
        }
    }

    // display the nodes
    public void display() {
        display(this.root, "This is the root node:"); // display the root node
    }

    private void display(Node node, String details) {
        // if no node is present just return
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        // display the left child
        display(node.left, "This is on the left side of:" + node.value + "->");
        display(node.right, "This is on the right side of:" + node.value + "->");
    }

    // suppose we are given a sorted array and we do not want to make a skewed tree.
    // we take the middle element at sort in that manner
    // 1 2 3 4 5 6 7 8 9
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        // else find the mid
        int mid = start + end / 2;
        // insert middle node as root node
        this.insert(mid);
        // populate the left and then right
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid + 1, nums.length);

    }

    /**
     * 
     * Pre-Order traversal -->> Node -->> left -->> right
     * pre means the root node, as only have the root
     * that we know of , this means something is done pre or first.
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        // if node is not null print the root value or the first value
        System.out.println(node.value);
        // then go tot the left and then go to the right
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder -->> node will be in the left and right
    // first print the left side and then the node and after that print the right
    // side
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        // print the left side
        inOrder(node.left);
        System.out.println(node.value + " ");
        // print the right side
        inOrder(node.right);
    }

    // postOrder-->> first print the left side then the right side and at last the
    // node
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        // print the left, right side
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }

    /**
     * Search the item-->> If the item we are searching for is less than the root
     * node then we go and search in the left side of the root and if the item we
     * are searching
     * for is greater then the root node then we go and search in the right side of
     * the root
     * 
     */
    public boolean search(Node root, int key) {
        if (root == null) {
            return true;

        }
        if (root.value == key) {
            return true;
        }
        if (root.value < key) {
            return search(root.left, key);
        } else if (root.value > key) {
            return search(root.right, key);
        }
        return false;
    }

}
/**
 * BSt -->> Important point -->> If the one of the node value in the right sub
 * tree of the tree is less than the root node, no matter if it is in the left
 * side of the node of the right side of root node.
 * That means if we have a value less then the root node at any point in the
 * right sub-tree, the tree is not a binary search tree.
 * (Q) how can we say that the tree is BST?
 * -->> If we check for any root node , what is the "largest" item in the left
 * sub-tree and
 * -->> also if we check what is the "smallest" item in the right-subtree,
 * satisfying the condition that the "largest node value
 * in the left sub-tree should be less than the root value" and similarly, the
 * "smallest value on the right subtree should be greater then the rootnode
 * value".
 * If this condition is satisfied then we have a BST.
 * 
 * Also if there is a single root node that has no left sub-tree and no right
 * sub-tree that
 * is also called as a BSt and also if no node/root is present that is also
 * called a BST.
 */