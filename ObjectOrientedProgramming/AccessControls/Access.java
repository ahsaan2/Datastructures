package ObjectOrientedProgramming.AccessControls;

public class Access {
    int num;

    String name;
    int[] arr;
    private int num2;

    // suppose we create a new num as private, so how do access that. __>> we can
    // access them by the use of getters and setters
    // setter for num2
    public void setNum(int num2) {
        this.num2 = num2;
    }

    // getter for num2
    public int getNum2() {
        return num2;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Access(int num) {
        this.num = num;
    }

    public Access(int[] arr) {
        this.arr = new int[num];
    }
}
/**
 * when we do not specify the access control, it will be allowed to access in
 * the same package but it can't be allowed in the different package.
 * 
 */
// private methods are accessed via getters and setters
// java util packages contains the  Data Structures
