package TreeDataStructure;


public class ArrayToBST {
    // convert the given array into the binary search tree
    /**
     * Strategy
     * 1. make the middle element as root
     * 2. we will form recursively subtrees from that middel node
     * a. start to mid -1 to form the left sub-tree(left side will have values less
     * than the root node)
     * b. mid+1 to end to form the right sub-tree(right side will have the values
     * greater then the root node)
     */
    // TreeNode roNode = null;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println( sortedBST(arr, 0, 4).val);

        // System.out.println(rootNode.left.val);
    }

    public static TreeNode sortedBST(int[] arr, int start, int end) {
        // base case, at any point if the start becomes greater then the end, we return
        // null
        if (start > end) {
            return null;
        }
        // first calculate the mid
        int mid = (start + end) / 2;
        // we have to create a node of the mid position in the array
        TreeNode rootNode = new TreeNode(arr[mid]);
        // now we have to construct the left and the right of the root
        rootNode.left = sortedBST(arr, start, mid - 1); // value less then the root, should go in the left of the root
                                                        // node
        rootNode.right = sortedBST(arr, mid + 1, end); // values greater then the root, should go in the right of the
                                                       // root
        // node
        return rootNode;
    }

    

}
