package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class sameTree {

  // private Node root;

  class Node {

    int val;
    Node left;
    Node right;

    public Node(int val) {
      this.val = val;
    }
  }

  public boolean isSameTree(Node q, Node p) {
    // we create a tree, that will hold all of our node values as well as null values
    Queue<Node> queue = new LinkedList<>(null);
    // add the root node of both the trees
    queue.add(p);
    queue.add(q);
    // now we have added the root nodes in queue
    // if q and p both are null, then we keep adding the values in the queue
    while (!queue.isEmpty()) {
        Node first = queue.poll();
        Node second = queue.poll();
      if (first == null && second == null) {
        continue;
      }
      // if one of the tree is null and the value that we extracter is not equal then we do not have the same tree

      else if (first == null || second == null || first.val != second.val) {
        return false;
      }
      // else add the nodes in the queue.
      queue.add(first.left);
      queue.add(second.left);
      queue.add(first.right);
      queue.add(second.right);
    }

    return true;
  }
}
// check if the two tree are same or not.
// we are given two binary trees, and we have to determine if they are exactly the same.
// here value and the position of the items should be same.
/**
 * Approach -->> Suppose if we do the level order traversal for the first tree and to the second
 * tree, if the values we get are similar then we can say that the tree are same.
 * Now if we do the level order traversal for the two trees, that have the same value
 * but they are structurally differnt, then they are not same trees.That is if the traversal
 * result is same the trees are not same. And how do we cope up with this problem.
 * // here we will adding left and right node values as well as the null values, to check for the strucuture is same or not
 *
 */
