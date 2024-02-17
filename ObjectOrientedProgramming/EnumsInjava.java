package ObjectOrientedProgramming;

public class EnumsInjava {

  enum Week {
    Monday,
    Tuesday,
    Thursday,
    Friday,
    Saturday,
    Sunday, // called as enum constants
  }

  public static void main(String[] args) {
    Week week;
    week = Week.Monday;  // ordinal =0
    week = Week.Friday;
    for (Week day : Week.values()) {
      System.out.println(day);
    }
    System.out.println();
    // ordinal -->> the position of the enum decleration
    System.out.println(week.ordinal());  // 3
  }
}
/**
 * An enum is a special class that represent a group of constants(unchangeable variables like final)
 * To create enum use enum keyword instread of class
 * Enum is short for "enumerations", which means "Specifically listed".
 * enum constants are public, static and final(that is they are inchangeable, cannot be Overriden).
 * We use enums when we know that the values aren't going to change, like a month days, days, colors.
 *
 */
