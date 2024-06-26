package Recursion;

public class nto1 {
    public static void main(String[] args) {
        // print numbers from n to 1
        fun(5);
        
    }
    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n);   // 5 4 3 2 1
        fun(n -1);
        // print 5 at the end, first print 1 2 3 4 for me.
        // System.out.println( );
        // fun(n-1);
        // System.out.print(n);
    }
}
