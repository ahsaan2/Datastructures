package StackDataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputReadClass {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");
        // // take the input from the user
        // int num =System.in.read(); // takes takes the ASCII value of each number and we print the same value or the key we press,
        // // since read return the interger, we must store it in the int variable
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        // / when ever we use bufferreader, it will take input from the input stream
        int num =Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}
