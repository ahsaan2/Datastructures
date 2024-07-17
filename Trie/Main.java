

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        // trie.insert("ABCD");
        trie.insert("abc");
        // trie.insert("ab cd @");

        // Before Removal
        System.out.println("Search abc, Found="+trie.search("abc"));
        // System.out.println("Search ab cd , Found="+trie.serach("ab cd "));
        
        trie.remove("abc");
        // After Removal
        System.out.println("Search abc, Found="+trie.search("abc"));

    }
}
