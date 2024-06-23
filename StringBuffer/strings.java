package StringBuffer;

public class strings {
    public static void main(String[] args) {
        String a = "ahsaan"; // we created a string a , and its value is present in the string pool
        System.out.println(a);
        // Strings are immutable__> we can not change the string once created
        a = "hello";
        System.out.println(a);
        // we said that the strings are immutable, but here we have two values of a
        // what happens is that once we create the string a , its value gets stored in
        // the string pool as "ahsaan" and that
        // value cannot be changed , and again then we create a new object of the a that
        // points to some different value this time. the value of a present first"ahsaan" is not modified
        System.out.println(a.equals(a));  // true
        // result is true if String objects that represent the same sequence of the characters as this object
        String a1 = "Ahsaan";
        String a2 = "Hello";
        String a3 = "Ahsaan";
        System.out.println(a1 == a3);  // true
        // (==) checks for both the values and the reference variable, if it is pointing to the same object
        System.out.println(a1 == a2);  // false
        String a4 = new String("Ahsaan");
        System.out.println(a1 == a4);  // false
        // when the values are the same, but there are two different objects, that point to the different memory locations 
        // in the heap memory
        String a5 = new String("Ahsaan");
        System.out.println(a4 == a5);  // false
        System.out.println(a4.equals(a5));  // true , checks for the value only, 

        // @Override
        // public static String valueOf(Object obj){
        //     return (obj == null) ? "null" : obj.toString();
        // }

    }
}
