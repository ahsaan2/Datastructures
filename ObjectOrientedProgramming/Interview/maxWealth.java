package ObjectOrientedProgramming.Interview;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 2, 8, 7 }, // ist customer has wealth of 17
                { 7, 3 }, // 2nd customer has a wealth of 10
                { 3, 5 } // 3rd customer has a wealth of 8
        };
        System.out.println(maximumWealth(accounts));
        // we are given the accounts and the bank, where accounts[i][j] is the amount
        // of money the customer has in the bank accounts. Return the wealth of the
        // richest man
    }

    // this is a typical problem of 2D array where we used to find the maximum
    // number, but here instead we have sum
    public static int maximumWealth(int[][] accounts) {
        // let the rows as customers or person
        int max = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            // let the col as the account of that person
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                // accounts[person].length --> signifies the variable length of the accounts of
                // a that particular person
                // now we have the sum variable which can hold the sum of the person and and the
                // account
                // sum+= row and col[at that row]
                // sum ie equal to the accounts and the accounts of that person
                sum += accounts[person][account]; // every single elements row+col in the accounts
            }
            // now if the sum is max of the value we have, we return the sum
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
   
}
