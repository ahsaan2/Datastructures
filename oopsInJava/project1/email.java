package oopsInJava.project1;

import java.util.Scanner;

/**
 * Sceneria: You are an IT support Adminstrator Specialist and are charged with
 * task of creating email accounts for new hires.
 * Your applications should do the following
 * 1. Generate an email with the following sytax: firstName,
 * lastName@department.company.com
 * 2. Determine the department (sales, development, accounting)
 * 3. Generate a random string for a password
 * 4. Have set methods to change the password, set the mailbox capacity and
 * define an alternate
 * 5. Have get methods to display the name, email and mailbox capacity
 */

public class email {
    private String email;
    public String departmentName = "company.com";
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength =10;
    private String department;
    // private int defaultmailBoxCapacity = 500;  // set as the default mail box capacity
    private int mailBoxCapacity;
    private String alternateMail;

    // Constructor to receive first name and last name
    email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created" + this.firstName + this.lastName);
        // call a method for asking the department
        this.department = setDepartment();
        System.out.println("Department is:-" + this.department);
        // password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:"+ this.password);
        // generate the random email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+"."+departmentName;
        System.out.println("Your email id is:"+email);
    }

    private String setDepartment() {
        System.out.println(
                "Enter the department\n1 for sales\n2 for development\n3 for accounting\nEnter department choice");
        // take the input value from the user
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "No department";

        }
        

    }

    // Generate a random password
    private String randomPassword(int length) { // takes the length of the password
        // since we have to generate the random password, we will need to have a
        // password set present
        String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        char[] password = new char[length];
        // generate the random password from the passSet
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passSet.length()); // random takes 0 and 1 only, since it provides it in
                                                                 // double values, we cast
            // it as interger value
            // If there are 30 characters present, and we want a random number between 0 and
            // 30. Now, we have 0 and 1 multiplied by 30

            // Now password at index i is equal to the passSet at random number
            password[i] = passSet.charAt(random);

        }
        // return password; // here the password is a set of characters, and we want it
        // as string
        return new String(password);

    }
    // set the mail box capacity
    public void setMailCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    // alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateMail = altEmail;
    }
    // setting the new password
    public void setNewPassword(String newPass){
        this.password = newPass;
    }
    // get the new capacity and email
    public int getMailCapacity(){return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateMail;}
    public String getNewPassword(){return password;}

}
