class TrieNode {

  TrieNode[] children;
  boolean isTerminal;

  public TrieNode() {
    children = new TrieNode[26];
    isTerminal = false;
  }
}

public class TrieDataStructure {

  private TrieNode root;

  TrieDataStructure() {
    root = new TrieNode();
  }

  // insert
  public void insert(String element) {
    TrieNode current = root;
    // get the s tring elements in the characters first
    for (char ch : element.toCharArray()) {
      // Initially root will be null, nothing is present then we create the new
      // trienNode of the same character
      if (current.children[ch-'a'] == null) {
        current.children[ch-'a'] = new TrieNode();
      }
      // now update the current
      current = current.children[ch - 'a'];
    }
    // once the characters finish, is terminal becomes true-->> that is we are at
    // the terminal point of the word
    current.isTerminal = true;
  }

  // now search for the elemnt
  public TrieNode SearchNode(String element) {
    TrieNode current = root;
    // get the characters
    for (char ch : element.toCharArray()) {
      // update the current
      current = current.children[ch - 'a'];

      if (current == null) {
        return null;
      }
    }
    return current;
  }

  public static void main(String[] args) {
    TrieDataStructure tt = new TrieDataStructure();
    tt.insert("abcd");
    tt.insert("ab");
    tt.insert("abdr");
    tt.insert("abfe");
    tt.SearchNode("abcd");
  }
}
