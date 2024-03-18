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
        // our length/ total length will be arr.length +1 because of the one missing
        // integer
        int n = arr.length + 1;
        // now sum is equal to
        int sum = n * (n + 1) / 2;
        for (int number : arr) {
            // our new sum will be equal to the sum - number, and the last number sum that
            // we will have
            // will only be the missing number
            sum = sum - number;
        }
        return sum;
    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        missingNumber obj = new missingNumber();
        int[] arr = { 1, 2, 3, 5, 6 };
        int ans = obj.missingnumber(arr);
        System.out.println(ans);

    }

}
