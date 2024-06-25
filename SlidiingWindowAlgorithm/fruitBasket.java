package SlidiingWindowAlgorithm;

import java.util.HashMap;

public class fruitBasket {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        int k = 2;
        System.out.println(totalFruit(arr, k));
        // the same question is solved using the sliding window approach
        // the approach is like, we can go till the length of the array
        // add the item at the right index in the map,
        // now we have to check if the segment is possible or not -->> for size should
        // be less than equal to k
        // what if the substring is not possible, we need to make it possible
        // -->> we have to trim down the left, -->> remove the element left from the
        // map, and if the frequ is 0, we can ask the map
        // to remove/delete the element from the map
        // keep updating left
        // Now, the segemnt is valie, we can have a check where we can compare the
        // length and update right
    }

    static int totalFruit(int[] fruits, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // int[] arr = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };

        while (right < fruits.length) {
            // add the item in the map
            map.put(fruits[right], 1);
            // what if the substring is not possible
            if (map.size() > k) {
                // we have to make it possible
                // trim the left value from map till size becomes under conditon and if it
                // becomes 0 remove it from the map
                while (map.size() > k) {
                    // we have to reduce the frequency of the left till the size of the map becomes
                    // 0
                    // map[fruits[left--]];
                    map.containsValue(fruits[left--]);
                    if (map.containsValue(fruits[left])) {
                        map.remove(fruits[left]);

                    }

                }
                // once this conditon is satisfies

            }
            // we now know the segment is valid,compare the lengths
            if (map.size() <= k) {
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);

            }
            right++;

        }
        return maxLength;

    }
}
