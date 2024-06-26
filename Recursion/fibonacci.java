package Recursion;

public class fibonacci {
    public static void main(String[] args) {
       System.out.println(fibo(6));
       // 6th fibonacci number is 8
        
    }
    // find the nth fibonacci number
    // each recursive call returns a value
    static int fibo(int n){
        // the base case of the recursive problem becomes the answers that we already know of
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n -  2);
    }
}
