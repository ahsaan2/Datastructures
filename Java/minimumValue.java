package Java;

public class minimumValue {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int minimum(int[] arr) {
        // suppose we take the first item at index 0 as min
        int min = arr[0];
        // now traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                // then update the min
                min = arr[i];

            }
        }
        return min;
    }

    // given an array find the minimum value in the array
    public static void main(String[] args) {
        int[] arr = { 12, 32, 45, 11, 5, 6, 8 };
        print(arr);
        int ans = minimum(arr);
        System.out.println(ans);

    }

}
