package Trie1;

class TrieNode {

    // each node has a array of childrens and a boolean for , if it is the
    // last/terminal of the word
    TrieNode[] children;
    boolean isTerminal;

    TrieNode() {
        children = new TrieNode[26];
        isTerminal = false;
    }
}

public class Trie {

    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }
    // insertion in the trie
    public void insert(String element){
        TrieNode current = root;
        // each trie-node has an array of character
        for(char ch : element.toCharArray()){
            // now we have got the character, check if the character is present in the root node
            if (current.children[ch - 'a'] == null) {
                // then we have an empty node, create a new TrieNode for this.
                current.children[ch - 'a'] = new TrieNode();
            }
            // now update the current
            current = current.children[ch -'a'];
            // once updated the string that we have to insert will get over and at that time, current will change the boolean to true
            // that is , at that time we are at the terminal of the word
        }
        current.isTerminal = true;
    }
    // return the TrieNode , if present
    public TrieNode searchNode(String element){
        TrieNode current = root;
        // get the characters
        for(char ch : element.toCharArray()){
            // update the current through characters
            current = current.children[ch - 'a'];
            // now while traversing if we have current as null, we can say that the trieNode is not present
            if (current == null) {
                return null;
            }
        }
        return current;
    }
   
    // now return true or false, is the word is present
    public boolean search(String element){
        TrieNode currentNode = searchNode(element);
        if (currentNode == null) {  // if element is not found
            return false;
        }
        return currentNode.isTerminal;  // will return true
    }
    // return true, if removed
    // return false, if not present
    public boolean remove(String element){
        // search the node
        TrieNode node = searchNode(element);
        if (node != null && node.isTerminal) { // if node is not null && node is found.
            node.isTerminal = false; // 
            return true;
        }
        return false;
    }
   
}
