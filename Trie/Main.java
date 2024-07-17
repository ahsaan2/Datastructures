package Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ABCD");
        trie.insert("ab cd @");

        // Before Removal
        System.out.println("Search abcd, Found="+trie.serach("abcd"));
        System.out.println("Search ab cd , Found="+trie.serach("ab cd "));
        
        trie.remove("abcd");
        // After Removal
        System.out.println("Search ABCD, Found="+trie.serach("ABCD"));

    }
}
