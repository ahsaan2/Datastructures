package TreeDataStructure;

import javax.swing.tree.TreeNode;

public class SuccessorOfNode {
    // given the key and find the successor of the node in the tree

}

public TreeNode findSuccessor(TreeNode root, int key){
    // if the root is not found then return null
    if(root == null){
        return null;
    
    }
    Queue<TreeNode> queue = new LinkedList<>();
    // first item in the queue will be root
    queue.offer(root);
    // remove the item from the queue and add children of it
    while (!queue.isEmpty()) {
        TreeNode currentNode = queue.poll();
        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }
        //now when we are removing the items , we are adding the children of it also, also when we remove the items if we find that the current item that we remove is our key,
        //  then we stop the program and we return the peek item
        if (currentNode.val == key) {
            break;
        }
        return queue.peek();

    }
}
