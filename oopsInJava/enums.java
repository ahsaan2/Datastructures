package oopsInJava;

enum Day { // Day acts as the class here , and the constants defined below are defined as
           // objects.
    // the enum declaration defines a class called(called as enum type)
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURADAY, SUNDAY; // all these are objects of the class Day
    // all these have a number , in java we start from 0
    // so, here we have 0 to 6
}

public class enums {
    // enum are special data type that "set the variables as predefined constants"
    // we should use enum anytime when we need to represent the predefined constant
    // like SUNDAY , MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURADAY, SUNDAY.
    public static void main(String[] args) {
        // int i = 5;
        Day day = Day.FRIDAY;
        Day day2 = Day.MONDAY;
        System.out.println(day2);
        System.out.println(Day.SUNDAY);  // since these variables are objects, we can just call them by the class
        System.out.println(day.ordinal()); // 4
        // "ordinal returns the position of this constant in the enum declaration"
        // if we want to get all the defined constants in the enum, wehave an inbuilt
        // function calles values
        Day[] obj = Day.values(); // gives us an array
        // this array is of type Day. so each object will give us type Day
        for (Day status : obj) {
            System.out.println(status + " order is "+status.ordinal());

        }

    }

}
