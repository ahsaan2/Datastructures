package Java;

public class resizeArray {
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // now resize the array
    public int[] resize(int[] arr, int original) {
        // this takes the array and original capacity as paramters
        // we create a temp array of size original
        int[] temp = new int[original];
        // now we have to move the items from the array to the temp
        // for that we traverse the array and put the items in temp
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];

        }
        // now set the temp to the original array
        arr = temp;
        // the size of the array is still 5 because of garbage collection, as we are not
        // returning the new array
        // if we return the new resized array the size will be
        return arr;

    }
    // how to re-size the array

    // we create a array of default size, and when we add items the space is taken
    // internally
    // the process keeps on till the new array of size double is creater and all the
    // items from
    // the precious array is copied to the new array.
    public static void main(String[] args) {
        resizeArray obj = new resizeArray();
        int[] original = { 1, 2, 3, 4, 5 }; // size of the original array
        System.out.println("The size of the original array is:" + original.length);
        // the size of the original array is 5
        original = obj.resize(original, 10);  // now we are returning the array
        // so the size here will be now 10
        System.out.println("The size of the resize array is:" + original.length); // 5

    }
}
