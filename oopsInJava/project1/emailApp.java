package oopsInJava.project1;

public class emailApp {
    public static void main(String[] args) {
        email e1 = new email("lone", "ahsaan");
        // set the alternate email address
        e1.setAlternateEmail("gs@gmail.com");
        // get the alternate email address
        System.out.println(e1.getAlternateEmail());
        e1.setMailCapacity(100);
        System.out.println(e1.getMailCapacity());
    }
}
