package ObjectOrientedProgramming.Interview;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 34, 45, 57, 89, 90, 100, 112, 222, 333 };
        int target = 3330;
        System.out.println(BinarySearch(arr, target));

    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // we have to keep checking till the start exceeds the end
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // we have 3 cases for finding the target,
            // Either the target will be greater than mid
            if (target > arr[mid]) {
                // searching is only done in the right side of the mid
                start = mid + 1;
            }
            // Either the target will be less than the mid
            else if (target < arr[mid]) {
                // searching is done in the left of the mid
                end = mid - 1;
            }
            // the target will be at the mid
            else {
                return mid;
            }
        }
        // If the target is not found then we have to return -1
        return -1;

    }

}
