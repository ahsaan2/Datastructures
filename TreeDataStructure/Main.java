package TreeDataStructure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomImplementationOfTree tree = new CustomImplementationOfTree();
        Scanner scanner = new Scanner(System.in);
       tree.populate(scanner);
      tree.display();
    }
}
