package Trie1;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("def");
        trie.search("abc");
        trie.search("def");
        System.out.println("Search element"+" "+ trie.search("abc"));
        System.out.println("Search element"+" "+ trie.search("abg"));
        System.out.println("Search element after removal"+" "+ trie.remove("abc"));
        System.out.println("Search element"+" "+ trie.search("abc"));



        // System.out.println("The element is"+ trie.searchNode("abc"));
    }
}
