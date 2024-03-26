package SearchingAlgorithms;

public class BinarySearch {
    /**
     * In binary search we look for an element X in a "Sorted Array" by first
     * comparing the X to mid point. If X is less than
     * the midpoint, then we search in the left sub-array and if X is greater than
     * the mid-point then we search in the right sub-Array.
     * We keep searching until we either find X or reduces the size of the array to
     * 0
     */
    public int binarySearch(int[] arr, int target) {
        // we need a start and end point
        int start = 0;
        int end = arr.length - 1;
        // also we need a mid point
        int mid; // we will not initialize it here, because mid will keep on changing
        while (start <= end) {
            mid = start + (end - start) / 2;
            // now case1: if the target is less than the mid
            if (target < arr[mid]) {
                // search in the left sub-array, that is reduce the end index to mid -1
                end = mid - 1;

            } else if (target > arr[mid]) {
                // search in the right subarray, increase the index of start to mid +1
                start = mid + 1;
            } else {
                // we will have our target at the mid , if both the above conditions fail
                return mid;
            }

        }
        return -1;
    }

    // recursive binary search
    private static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        // case 1
        if (target > arr[mid]) {
            return recursiveBinarySearch(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return recursiveBinarySearch(arr, target, start, mid - 1);
        } else {
            return mid;
        }

    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = { 1, 4, 8, 9, 10, 11, 12, 22, 34 }; // for Binary search , Array should be sorted
        int ans = search.binarySearch(arr, 12);
        int ans2 = search.binarySearch(arr, 34);
        System.out.println(ans2); // 8
        System.out.println(ans); // 6
        int ans3 = recursiveBinarySearch(arr, 34, 0, arr.length - 1);
        System.out.println(ans3);

    }
}
