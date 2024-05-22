package ObjectOrientedProgramming.Interview;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        int target1 = 30;
        System.out.println(descendingOrder(arr1, target1));

    }

    // we are given an sorted array, find the target
    // The sorted array is not known whether it is in ascending order or descending
    // order
    static int descendingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // check for ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            // array is in ascending order
            // make the booleasn isAsc as true
            isAsc = true;

        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid; // same for both the ascending order array or descending order

            }
            // now inCase of ascending order
            if (isAsc) {
                if (target > arr[mid]) {
                    // search in the right space
                    start = mid + 1;
                } else {
                    // search in the left space
                    end = mid - 1;
                }
            }
            // Now if the array is not ascending, then it is in descending order
            else {
                if (target > arr[mid]) {
                    // search in the left space. changes the end
                    end = mid - 1;
                } else {
                    // search in the right space
                    start = mid +1;
                }
            }

        }
        return -1;

    }

}
