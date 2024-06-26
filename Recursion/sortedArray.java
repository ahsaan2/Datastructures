package Recursion;

public class sortedArray {
    public static void main(String[] args) {
        // given an array, check if the array is sorted or not

        int []arr = {1,2,3,4,1,6,0,7,8};
        System.out.println(isSorted(arr, 0));
        
    }
    static boolean isSorted(int[] arr, int index){
        // the index will reach till the end only and only if the array is sorted, if it does not then the array is not sorted
        if (index == arr.length -1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
