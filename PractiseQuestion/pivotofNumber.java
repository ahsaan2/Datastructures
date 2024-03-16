package PractiseQuestion;

public class pivotofNumber {
    // we are given a number we have to find the pivot of the number that is
    // n = 8 -> 1 2 3 4 5 6 7 8
    // 1 to 6 = 21, 6 to 8 = 21
    // the pivot is 6
    public static int pivotInteger(int n) {
        int start = 1;
        int end = n;
        int startValue = start;
        int endValue = end;
        // traversing the n
        while (start < end) {
            // the goal here is that we should have the numbers till the pivot equal to the
            // numbers from pivot to n
            if (startValue < endValue) {
                start++;
                startValue += start; // keep adding the value at start

                System.out.println("The start values of the number is:" + startValue);
            } else {
                end--;
                endValue += end; // keep adding the value at the start

                System.out.println("The end values of the number is:" + endValue);

            }
            if (startValue == endValue && start + 1 == end - 1) {
                System.out.println("The pivot of the number is:");
                return start + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int ans = pivotInteger(49);
        System.out.println(ans);

    }

}
