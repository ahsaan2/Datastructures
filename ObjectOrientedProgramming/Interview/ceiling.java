package ObjectOrientedProgramming.Interview;

public class ceiling {
    public static void main(String[] args) {
        // We are given a sorted array and we have to find the ceiling of a target
        // number
        // 2, 3, 5, 9, 14, 16, 18 -->> target number is: 14 -->> ceiling is 14
        // if target is 15, ceiling is 16
        // then ceiling of the given number means, find the smallest number that is
        // ""greater than or equal to the target number""\
        // approach --> if we do not find the target element, instead of returning -1 we
        // return the next greater element.

        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 17;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
        System.out.println(floor(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
        // if target is greater than the element at the arr.length index then
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // now conditions
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        // once the while loop condition voilates, the start becomes greater than the
        // end and the answer is not found
        // because of the above conditions,,
        // the ceiling number is given by the start
        return arr[start];

    }

    static int floor(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
