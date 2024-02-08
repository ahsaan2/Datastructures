package TreeDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;
import javax.swing.tree.TreeNode;

public class BFS {

    /**
     * Breadth first search or level first search -->> it is used to search a graph
     * data structure , similar to tree traversal for a node that meets a set of
     * criteria.
     * It starts from the "root node and visits all nodes at the current depth
     * level"
     * before moving on to the nodes at the next depth level.
     * Here we go level by level.
     * --------------when to use the BFS---------
     * 1. when ever our answer lies near the root of the tree.
     * 2. when we are asked to search by levels.
     */
    /**
     * -------ALGORITHM----
     * // HERE WE STORE THE EVERY CHILD OF THE NODE IN THE QUEUE AND WE ACCESS IT,
     * WE ACCESS THE ITEMS IN THE FIRST IN FIRST OUT.
     * 1. create a queue and fill it with the items
     * 2. get the root node at the beginning of the queue.
     * 3. Once we have removed the head of the queue, or the root node, we then add
     * all the child items of the root node in the queue, now since we got all the
     * child nodes of the root node
     * we then "remove the first child of the root node" and "add its children" in
     * the
     * queue if present in the queue. We keep this process till the queue gets
     * "empty"
     * and by this way we access all the items in a level manner.
     */
    // we store the items of level in the list of list
    public List<List<Integer>> levelOrder(TreeNode root) {
        // we store the items in the list of a list
        List<List<Integer>> result = new ArrayList<>(); // this is the bigger list, that has the current list inside it,
                                                        // that will hold the items removed from the queue
        if (root == null) {
            return result;
        }
        // we start from the root node, and we have to have a queue to store all the
        // child nodes
        Queue<TreeNode> queue = new LinkedList<>();
        // Initially it will only have the root node
        queue.offer(root);
        // now we will keep removing till the queue gets empty and
        while (!queue.isEmpty()) {
            // suppose initially it only has root node in it , and we have size as
            // queue size [1] --> is the root,
            // and now if we remove 1 and the size of the queue is going to the size of the
            // children of the root node, that is twice the present size.
            // every time we remove a level, the size of the queue goes double the previous
            // size.
            int levelSize = queue.size(); // 1 --> 2 --> 4 --> 8
            // every level will have a current level list
            List<Integer> current_level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                // for loop maintain's how many elements are there in a level
                // get me the current node
                TreeNode currTreeNode = queue.poll(); // removes 1
                // we will get the first node, and we put that in the current level
                current_level.add(currTreeNode.val); // we keep removing one nod from the queue, and add that node in
                                                     // the current level.
                // as we are removing the node, we are adding its left and right child in the
                // queue
                if (currTreeNode.left != null) {
                    queue.offer(currTreeNode.left);

                }
                if (currTreeNode.right != null) {
                    queue.offer(currTreeNode.right);

                }

            }
            // after this loop gets finisher, we have a curreny level , and we add that in
            // the main result level we created
            result.add(current_level);
        }

        return result;

    }
}
