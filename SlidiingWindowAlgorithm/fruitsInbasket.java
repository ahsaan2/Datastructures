package SlidiingWindowAlgorithm;

import java.util.HashMap;

public class fruitsInbasket {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2 };
        System.out.println(totalFruit(arr));

    }

    // we have a hashmap as baskets, where we will store the items
    static int totalFruit(int[] arr) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> bucket = new HashMap<>();
        // now at the begining of the hashmap we can have the number of fruits as 0 and
        // ther value can be also 0
        while (right < arr.length) {
            int current = bucket.getOrDefault(arr[right], 0);
            // now put the first fruit and increase the value by 1
            bucket.put(arr[right], current + 1);

            // now if the basket size is greater then 2 , then we have to take items out of
            // the map. and remove if there value
            // becomes 1
            while (bucket.size() > 2) {
                // if the number of items in the map of that of the left index is 1 , we remove
                // that from the map
                // get the current count of the number
                int count = bucket.get(arr[left]);
                // now we can check if count is 1, then remove it
                if (count == 1)
                    bucket.remove(arr[left]);

                else
                    // rmove the value by 1, and also put that value in the map again/ update value
                    // after removing 1
                    bucket.put(arr[left], count - 1);
                // update the left
                left++;

            }
            // if the bucket size is in control then we have to find the length

            maxLength = Math.max(maxLength, right - left + 1);
            right++;

        }
        return maxLength;

    }

}
// getOrDEfault>> (Object key, V defaultValue) -> is used to get the value
// mapped with the specified key. If no value is mapped
// wth the provided key then the default value is returned.
