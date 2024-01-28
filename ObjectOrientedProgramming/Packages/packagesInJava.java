package ObjectOrientedProgramming.Packages; // 

// the file package lies in the ObjectOrientedProgramming.

public class packagesInJava {
    /**
     * Packages in java:->> Pakages are the containers or boxes for classes, it is
     * used to keep the class name in compartments or compartmentalised.
     * -->> A package is just a folder in simple words.
     * -->> Packages are stored as a hierarchical manner.
     * (Q) --> when we create packages how does java know in which file to look for
     * to run it?
     * (ANS) ->> Due to the import statement, it imports the package where the method
     * code or message is present and then it is used.
     * 
     * 
     */
    public static void main(String[] args) {
        // A obj = new A(null);
        System.out.println("Hii");

        // System.out.println(obj); // prints -->> ObjectOrientedProgramming.A@36baf30c
        // println internally calls toString() method -->>
        // if toString() method is not present in the objects class, java takes the
        // default toString method.
        // which gives us
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // -->> our output>>=> ObjectOrientedProgramming.A@36baf30c
    }

}
