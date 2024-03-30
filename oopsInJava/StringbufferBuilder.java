package oopsInJava;

public class StringbufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        // string buffer will have a string that will be mutable.
        System.out.println(sb.capacity());
        // The default capacity of the stringBuffer will be 16.
        StringBuffer sb2 = new StringBuffer("hello"); // 5 characters, total =21
        // if we now want to lool for the capacity we will get 21, it will store 5 character ans give 16 character space extra.
        System.out.println(sb);
        // append
        sb2.append(" & Welcome");
        System.out.println(sb2);
        System.out.println(sb2.capacity());  // 21
        // coverting the string buffer data back to the string can be done by the use of toString()
       // String str = sb2;  // mismatch can not covert from string buffer to string
        String str = sb2.toString();
        System.out.println(str);
        System.out.println(sb2.delete(1, 2));  // deletes till end -1
        System.out.println(sb2.delete(1, 3));
    }
    
}
/**
 * If we want to have mutable string, and thats why we have two different classes in java.
 * StringBuffer:-> A thread-safe. StringBuffer are safe for the use of multile threads. The methods are synchronized.
 * A thread in java is the direction or the path that is taken while a program is executed.
 * The principal operation of the string buffer is append() and insert.
 * append()-->> adds at the end of the string
 * insert()-->> insert at the particular index.
 * ----------------------------------------------------------------------------------------------------------------
 * StringBuilder:-> The only difference between is StringBuilder is not thread-safe.
 * These are not thread-safe.
 * Thus StringBuilder are faster than the StringBuffer.
 * These have same methods as that of the StringBuffer.
 * 
 */
