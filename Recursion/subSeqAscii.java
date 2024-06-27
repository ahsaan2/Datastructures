package Recursion;

public class subSeqAscii {
    public static void main(String[] args) {
        String s = "abc";
        subSeq("", s);
        
    }
    // print the sub sequences with their ascii values
    static void subSeq(String ans, String original){
        // if we reach till the end, and the original array is empty then we have the answer
        if (original.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        // now at every function call , we have 2 options either we take it or we leave it
        subSeq(ans + ch, original.substring(1));
        subSeq(ans, original.substring(1)); 
        // now for the ascii value, we add 0 to the character 
        subSeq(ans + (ch+0), original.substring(1));
    }
}
