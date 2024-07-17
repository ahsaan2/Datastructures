package Trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> childrens;
    boolean isTerminal;

    TrieNode(){
        childrens = new HashMap<>();
        isTerminal = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    private TrieNode searchNode(String element){
        TrieNode current = root;
        for(char ch : element.toCharArray()){
            current = current.childrens.get(ch);
            if(current == null){
                return null;
            }
        }
        return current;
    }

    // stores element string in a trie.
    // element = abc
    public void insert(String element){
        TrieNode current = root;
        for(char ch : element.toCharArray()){
            current.childrens.computeIfAbsent(ch, c -> new TrieNode() );
            current = current.childrens.get(ch);
        }
        current.isTerminal = true;
    }

    // returns true, if element present in a trie data structure
    public boolean serach(String element){
        TrieNode searchNode = searchNode(element);
        if(searchNode == null) return false;
        return searchNode.isTerminal;
    }

    // return true => if removed
    // return false => if not present
    public boolean remove(String element){
        TrieNode node = searchNode(element); // RunTime Complexity O(n) where n is the length of the element
        if(node != null && node.isTerminal){
            node.isTerminal = false;
            return true;
        }
        return false;
    }
}
