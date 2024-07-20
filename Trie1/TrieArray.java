package Trie1;

// package Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class TrieNode {

  Map<Character, TrieNode> childrens;
  boolean isTerminal;

  TrieNode() {
    childrens = new HashMap<>();
    isTerminal = false;
  }
}

public class TrieArray {

  private TrieNode root;

  public TrieArray() {
    root = new TrieNode();
  }

  private TrieNode searchNode(String element) {
    TrieNode current = root;
    for (char ch : element.toCharArray()) {
      current = current.childrens.get(ch);
      if (current == null) {
        return null;
      }
    }
    return current;
  }

  // stores element string in a trie.
  // element = abc
  public void insert(String element) {
    TrieNode current = root;
    for (char ch : element.toCharArray()) {
      Function<Character, TrieNode> func = param -> new TrieNode();
      current.childrens.computeIfAbsent(ch, func);
      // computerIfAbsent method checks if the key is present , and if the key is not present already it executes the
      // lambda function which creates a TrieNode instance and returns it.
      // The resulting TrieNode instance is added to the 'children' map with the key 'ch'.
      current = current.childrens.get(ch);
    }
    current.isTerminal = true;
  }

  // returns true, if element present in a trie data structure
  public boolean serach(String element) {
    TrieNode searchNode = searchNode(element);
    if (searchNode == null) return false;
    return searchNode.isTerminal;
  }

  // return true => if removed
  // return false => if not present
  public boolean remove(String element) {
    TrieNode node = searchNode(element); // RunTime Complexity O(n) where n is the length of the element
    if (node != null && node.isTerminal) {
      node.isTerminal = false;
      return true;
    }
    return false;
  }
}
