package TreeDataStructure;

public class TreeIntroduction {
    /**
     * Trees are similar to linked lists, but each node points to a number of nodes.
     * --> Trees represent the "heirarchical nature of a structure in a graphical"
     * form.
     * -->> Tree is a hierarchial structure as elements in a tree are arranged in
     * multiple levels.
     * In trees order of elements is not important, apart from BST
     * -->> A node with no children in known as "leaf node."
     * -->> set of all nodes at a "particular depth" in known as "level", root node
     * is at 0th level.
     * -->> Depth of a node-->length of the "path from root node to that node".
     * -->> size of the node-->> the number of descendants it has along with the
     * node iteslf.
     * // Skwed Tree-->> If every node in the tree has only one child, it can be
     * either on the left side(left skewed) or on the right side(right skewed).
     */
    /**
     * --------------WHY Trees?----------------
     * We can add the items or remove the items or find the items in the tree data
     * structure in O(log n) time.
     * -->> Ordered storage.
     * Limitation -->> unBalanced binary tree has a efficieny of O(n). , how do we
     * solve this problem-->> We create binary trees that will balance themselves
     * automatically, these are known as self balancing binary trees or AVL tree's.
     * 
     * -------Where it is used-----
     * 1. Binary trees are used in the file systems. (File Systems)
     * 2. Every Single Node can represent a "folder directory" or a file with the
     * parent child relationship.
     * 3. DataBases.
     * 4. Network Routing. (Path finding algorithms)
     * 5. Decision trees used in machine learning algorithms.
     * 6. Compressing files (Huffman Coding algorithms)
     */

    /**
     * -----Properties of the trees------
     * 1. Size of the tree's-->> Total number of nodes
     * 2. Any two nodes with the same parent are called as "Siblings".
     * 3. Edge-->>means the line that "connects" the two nodes.
     * 4. Height -->> maximum number of edges between the two nodes, it can also be
     * defined as the maximum number of edges from the node we are at to the leaf
     * node.
     */

    /**
     * -------TYPES OF BINARY TREE'S--------
     * 1. Complete Binary Tree-->> All the levels are full, and the last level
     * should be full from the left to the right.
     * 2. Full Binary Tree-->> If each node has exactly "two children" and all the
     * leaf nodes are at same level.
     * 3. Strictly Binary Tree-->> If each node has "exactly 2 children"or no
     * children.
     * 4. Ordered Binary Tree-->> Every node has some property , like binary search
     * trees. (left node is less then the parent node and right node is greater than
     * the parent node).
     * 5.Perfect Binary Tree-->> All the internal nodes have 2 children and all the
     * leaf nodes are at the same level.
     * 
     * 
     */

      /**
     * Deque:->(is a interface) A linear collection that supports insertion and deleteion at both ends.
     * The name is short for double-ended-queue.
     * offerFirst, peekFirst, pollFirst -->> these operations occur at the front of the deque.
     * offerLast, peekLast, pollLast -->> these operations occur at the end of the deque.
     * 
     */
}
