package Recursion;

public class subSequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("The sub sequence are as:");
        subSeq("", s);
        
    }
    // return the every su sequence of the characters, 
    static void subSeq(String ans, String original){
        // If the original string becomes empty then we have got the answer
        if (original.isEmpty()) {
            // we have each of the subsequence in the ans
            System.out.println(ans);
            return;
        }
        // now at every index of the character, we have 2 options either we tak eit or we leave it.
        char ch = original.charAt(0);
        subSeq(ans + ch, original.substring(1));
        subSeq(ans, original.substring(1));
    }
}
