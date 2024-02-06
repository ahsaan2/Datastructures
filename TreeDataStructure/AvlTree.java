package TreeDataStructure;

public class AvlTree {
    /**
     * These tree's are also known as self-balancing tree's / Height Balanced trees
     * When ever we insert a node in the tree, it makes them un-balanced, but that
     * is not the case here, we insert the node these trees re-arrange the nodes and
     * make them balanced.
     * -->> Balanced means the height difference between the left tree and the right
     * tree should "not be greater" than 1.
     * -->> Why AVL tree's? => Binary trees can some times form a chain of nodes if
     * they are continuously put in a increasing order, then the whole order of time
     * complexity changes from O(log n) to O(n).
     * ------How does AVL Balance the tree nodes-------
     * -->> Once we insert the nodes, it checks if the node inserted is balancing
     * the tree or not, if not , it will insert the node at that position and then
     * re-structures the tree such that the tree becomes balanced.
     * -----ALGORITHM------
     * 1. Insert the node normally
     * 2. Start from the node n and find the node that make the tree un-Balanced(so
     * this is a bottom-up approach).
     * Once we find the node that is making the tree un-Balanced we solve first that
     * part and then we move up again.
     * 3. using 1 of the 4 rules rotate.
     */
    /**
     * // rotation occurs for the node that we have just inserted.
     * ----------------Rules---------
     * Rule 1 -->
     * "left-left case": child and the grand child are on the left side. It is a
     * left-heavy.
     * --->> If we found a case like this where we are left heavy , we will just do
     * a "right-rotate".
     * Case:- left-left case". -->> height(node.left) - height(node.right) > 1 .
     * node.left.left > node.left.right (left heavy)
     * 
     */
    /**
     * Rule 2 -->>
     * "left-right case":- child is on the left side while as grand child is on the
     * right side.
     * -->> Here we should be able to make the child and grand child in a single
     * line, for that we first do "left rotate" at the child node
     * and this rotation makes them in a single line.
     * --> Once we have the child and the grand child in a single line, we have got
     * the first case, so similarly we do the "right-rotate" at p.
     * -->> So we got here, "1 left-rotate and 1 right-rotate."
     * 
     */
    /**
     * Rule 3 -->>
     * "Right -Right case" :-> child class and grand child is on the right-side, so
     * this means we have a right heavy
     * -->> In right heavy we will simply do the "left-shift".
     */

    /**
     * Rule 4 -->>
     * "Right-left case":-> child goes on the right side of the parent and grand
     * child goes on the left side of the child.
     * -->> we will first do the "right rotate "at child, both grand child and the
     * child nodes will be now present in a single line and then we will have a
     * "left rotate".
     */

    /**
     * If the subtree itSelf itself is un-balanced after adding a node in it, and
     * now we have solved the sub-tree and it becomes balanced,
     * so when the sub-tree is balanced the above tree is also going to be balanced.
     */
/**
 *  -----Time Complexity of the AVL Tree------
     * Because every time the tree will be balanced, so the time complexity will be
     * log(n) + rotations(rotations is either left or right, so it takes constant
     * time).
  
 * 
 */
}
    

    