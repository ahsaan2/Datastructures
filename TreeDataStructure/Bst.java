package TreeDataStructure;

public class Bst {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int [] nums = {90, 80, 100, 70, 75, 105, 110, 102};
        tree.populate(nums);
        // int [] nums2 = {1,2,3,4,5,6,7,8,9};
        // tree.populateSorted(nums2);
        tree.display();

    }
}
