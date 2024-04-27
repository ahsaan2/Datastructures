package PractiseQuestion;



public class medianOfTwoSortedArrays {
    // Given the two sorted arrays, we have to find the median of it
    /**
     * Median means on the left side of the number there must be equal number of
     * items as on the right side of the number
     * We will merge both the arrays in a single array and try to find the median
     * array1 = 1,3,5,6,7
     * array2 = 3,5,8,9
     * result array = 1,3,3,5,5,6,7,9
     * the number of items here are 8 , and for 8 we cannot have the equal number of
     * items from the element that can be the median
     * thus, here the median lies somewhere between the 5 and 5
     * 
     * Here we have two cases
     * 1. Case1: the total number of items are even--> for that we take the two
     * elements, there sum and divide by 2 gives us the median
     * 2. Case2: the total number of items are odd-->> we have the mid items as
     * median
     * 
     * Brute force approach-->>
     * 1. Merge the two sorted arrays first
     * 
     */
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 7, 10, 12 };
        int[] arr2 = { 2, 3, 5, 6 };
        double ans = merge(arr1, arr2);
        // {1,2,3,3,4,5,6,7,10,12}
        System.out.println(ans);
    }

    // merge the two arrays in one sorted array
    public static double merge (int[] arr1, int [] arr2){
        int i =0; int j =0; int k = 0;
        int [] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i];
                i++;
            }
            else{
                result[k++] = arr2[j];
                j++;
            }
            
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        //now here we have a sorted array mixture of array1 and array2
        // now find the median of the array
        int total = result.length;
        // case1 for the odd number of items in the result array
        
        if (total % 2 != 0) {
            // median = total length of the result / 2
            return (double) result[total / 2];
        }
        // case 2 : when we have even number of items
        int n1 = result[total /2];
        int n2 = result[total / 2 -1];
        return ((double) n1 + (double) n2) / 2;

    }
}