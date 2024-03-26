package SortingAlgorithm;

public class BubbleSort {
    /**
     * In bubble sort, we start at the beginning of the array and swap the first two
     * elements if the first is greater than the second.
     * Then, we go to the next pair and so on. continuosly making swaps until the
     * array is sorted.
     * In doing so the smallest items slowly bubbles up to the begining of the list
     * Bubble(at each iteration the largest item is sorted, and the smalles item
     * bubbles up to the begining of the list).
     * 3 1 5 2 6 4 --> pass 1:- 1 3 2 5 4 6 => Is iteration gives us the largest
     * number at its correct index
     * ist pass. compare 3 and 1 (swap) compare 3 and 5(no swap) compare 5 and
     * 2(swap) compare 5 and 6(no swap) compare 6 and 4(swap)
     * pass 2: swap 3 and 2 , swap 5 and 4
     * 1 2 3 4 5 6 . pass 2 gives us the 2nd largest item at its correct index
     * pass 3: No swapping at all
     * 1 2 3 4 5 6 we have sorted array
     * 
     */
    private void bubbleSort(int[] arr) {

        // here after each pass 1 item is at the correct place, that means when we will
        // have one complete for i loop
        boolean swapped; // we can have a boolean for whether swap occurs or not
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            swapped = false;
            // now for the comparison we will have the j loop
            for (int j = 0; j < n - i - 1; j++) {
                // each time we will have one item at its perfect index so , we reduces the
                // comparing space by -i
                if (arr[j] > arr[j + 1]) {
                    // then swap the two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // here the swapping will take place
                    swapped = true;

                }

            }
            // if no swapping is done, then we simply break the loop
            if (!swapped) {
                break;
            }

        }

    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = { 5, 2, 4, 1, 7, 6, 9, 0, 8 };
        sort.display(arr);

        sort.bubbleSort(arr);
        System.out.println();
        System.out.println("Sorted Array is:");
        sort.display(arr);
    }

}
