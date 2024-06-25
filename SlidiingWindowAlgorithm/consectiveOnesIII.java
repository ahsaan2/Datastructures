package SlidiingWindowAlgorithm;

public class consectiveOnesIII {
    // we are given an array and K , we have to return the max number of consecutive
    // 1', in the array if you can flip at max k 0's.
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

        // int[] arr = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }

    public static int longestOnes(int[] arr, int k) {
        // we have to return the max length
        // the brute force approach to this problem can be, if we are able to find the
        // longest substring with
        // at most k zeroes. -->> This will give us the longest sub-array that has the
        // max number of 1's and
        // the k number of zeroes
        // Once we get the max number of ones along with the 0's we are able to find the
        // longest subarray with max ones
        // (Find the max 1's that has K number of 0's in it)
        // ==>> Now we will try to generate all the sub-arrays that satisfies the
        // condition

        // 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0
        int maxLength = 0;
        // we traverse the array first
        for (int i = 0; i < arr.length; i++) {
            // now we can generate the sub arrays
            // we can take the number of zeroes in account also
            int numberOfZeroes = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    // 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1
                    numberOfZeroes++; // zeroes become 4 here
                    // j is now at the 4th zero, but we don not need j at the 4th zero index

                    // now we have for the first iteration i at index 0 and j at the index of 0 ,
                    // where number of zeroes <= k
                    // so we can define the length of the substring here

                }
                // now here the number of zeroes are 4, but the below condition is given for the
                // k equal to the number of zeroes
                // here j is at the 4th index of the zero, but the conditio here satisfies that
                // j is at hte 4th index - 1
                if (numberOfZeroes <= k) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);

                } else {
                    break;
                }

            }
        }

        return maxLength;

    }

}
