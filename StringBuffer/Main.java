package StringBuffer;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    StringBuffer sb1 = new StringBuffer();
    System.out.println(sb1.capacity());   // the default capacity is 16 for the stringbuffer.
    // every single buffer has a capacity, and till that capacity does not exceed, there is no need to
    //allocate a new buffer array.If the internal buffer overflows it is automatically made larger.
    sb.append("We make devs");
    sb.append( " is nice");
    sb.insert(2, " and you");
    System.out.println(sb.toString());
    System.out.println(sb.capacity());
    System.out.println(sb.reverse());
    String senctence = "ahs  ad r s adfa fadfa ";
    String [] names = senctence.split(" ");
    System.out.println(Arrays.toString(names));

}
}
/**
 * stringBuffer-->> mutable sequence of characters.
 * StringBuffer -->> is mutable.
 * StringBudders are thread-safe, the methods are synchronized.
 * The principal operations on the stringBuffer are code insert and code append methods.
 * thread -->>  a single sequential flow of control within a program(or a small unit of processes).
 * threadSafety-->> Suppose when one thread is working on some data, and it will prevent any other
 * thread to work on this data.
 * append-->> always adds these characters at the end of the buffer.
 * insert-->> adds characters at a specified buffer.
 */
// stringBuilder-->> not thread safe, thus works faster then the stringBuffer.
