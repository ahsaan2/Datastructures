package Java;

public class missingNumber {
    // given an array of distinct numbers find the missing numbers in the range of 1
    // to n
    // 1 2 3 4 6 7 8-->> ans = 5
    // Approach 1 -->> using mathematical formulla
    // we know that the sum of first n natural numbers in n
    // sum = n * (n + 1) / 2 // n = arr.length +1 because of index that start from 0
    // sum = 8 * (8+1)/2 = 36
    // 36 - 1 = 35 -> 35 - 2 = 33 -> 33 - 3 -> 30 -> 30 - 4 = 26 -> 26 - 6 = 20 ->
    // 20 - 7 = 13 -> 13 - 8 = 5
    // finding the missing number
    public int missingnumber(int[] arr) {
        // our length total length will be arr.length +1 because of the one missing
        // integer
        int n = arr.length + 1;
        // now sum is equal to
        int sum = n * (n + 1) / 2;
        for (int number : arr) {
            // our new sum will be equal to the sum - number, and the last number sum
            // that
            // we will have
            // will only be the missing number
            sum = sum - number;
        }
        return sum;
    }

    public int missing(int[] arr) {
        // at index 0 we have 1
        // at index 1 we have 2
        // at index 2 we have 3
        // at index 3 we have 5
        // at index 4 we have 6
        // so the missing number is 4 that is array at index != index +1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;

            }

        }
        return -1;

    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        missingNumber obj = new missingNumber();
        // these two methods will give us only one missing number and if we have to find
        // the more than one missing number, we can create a list that can hold our
        // missing numbers
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int[] arr2 = { 1, 2, 4, 5, 6, 7, 8 };
        int ans = obj.missingnumber(arr2);
        System.out.println(ans); // 3
        int ans2 = obj.missing(arr);
        System.out.println(ans2); // 2

    }

}
