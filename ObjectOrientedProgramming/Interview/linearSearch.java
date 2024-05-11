package ObjectOrientedProgramming.Interview;

public class linearSearch {
    // In the best case, only one iteration will happen and the item will be
    // returned at the index 0f 0
    // worst case, iterate through the entire array, and in the end we do not find
    // the item
    // space complexity here is constant.
    public static void main(String[] args) {
        int[] arr = { 23, 31, 44, 55, 41, 66, 56, 57 };
        int target = 44;
        System.out.println(search(arr, target));
        System.out.println(search(arr, 55));
        System.out.println(isPresent(arr, 66));
        System.out.println(isPresent(arr, 100));
        int[] arr1 = {};
        System.out.println(isPresent(arr1, target));
        // searching in a string
        String str = "qwerty";
        char target2 = 't';
        System.out.println(searchstring(str, target2));
        System.out.println(search3(str, target2));

    }

    static int search(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index]; // takes each element at each time
            if (element == target) {
                // return index;
                return element;
            }
        }
        return -1;
    }

    // boolean check if the element is present or not
    static boolean isPresent(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // search in a string
    static boolean searchstring(String str, char target2) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target2) {
                return true;
            }
        }
        return false;
    }

    // return the character
    static char search3(String str, char target2) {
        if (str.length() == 0) {
            return 'c';
        }
        for (char ch : str.toCharArray()) {
            if (ch == target2) {
                return ch;
            }
        }
        return 'c';
    }

}
