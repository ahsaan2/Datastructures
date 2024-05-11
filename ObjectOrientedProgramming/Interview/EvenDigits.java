package ObjectOrientedProgramming.Interview;



public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12, 343, 2, 6, 7896};
        // given the array we have to return the number of even digits present, In this case it is 2
        System.out.println(evenDigits(nums));
    }
    static int evenDigits(int [] arr){
        // here we can first check first if the number is even
        // if the number is even count the numbers by dividing by 10
        // update the count
        int count =0;  // initially the number of even digits is 0
        // traverse the array
        for (int  num : arr) {
            if (even(num)) {
                count++;
                
            }
        }
        return count;
        
    }
    static boolean even(int num){
        // check for the even number or not
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count =0;
        while (num > 0) {
            count++;
            num/=10;
        }
        return count;
    }
}
