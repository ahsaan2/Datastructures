package Java;

public class Arrays {
    // print the array
    public void array(int[] arr) { // creating a method that takes the array
        // get the length
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrays obj = new Arrays();
        int[] arr = { 12, 21, 32, 34, 54, 56, 66 };
        obj.array(arr); // calling the method via object
        // or we can initialize it in the single line
        obj.array(new int[] { 11, 22, 33, 44, 55, 66, 77, 88 });
        int[] arr2 = { 3, 4, 7, 10, 6, 5 };
        // obj.remove(arr2);
        obj.array(arr2);
        // int[] res = remove(arr2);
        // System.out.println(res);
        // System.out.println(remove(arr2));
        // int [] result = remove(arr2);
        // System.out.println(result);

    }
}
