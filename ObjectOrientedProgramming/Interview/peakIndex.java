package ObjectOrientedProgramming.Interview;

public class peakIndex {
    // given ans sorted array we have to find the peak element index in the array
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10,12, 5, 1 };
        System.out.println(searchPeak(arr));

    }

    // since we are given the sorted array, we can use binary search
    // and if we look at the question , here we can find two parts, the part till
    // which we have increasing order elements
    // and th path from where the elements start to decrease its values
    // now the element from which the decreasing array starts, is the point of peak
    // index
    static int searchPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // means we are at the increasing array, and the possible answer can lie in the
                // right side of the mid
                start = mid + 1;

            } else {
                // the possible answer or peak can be the mid
                end = mid;
            }
        }
        return end;

    }
}
