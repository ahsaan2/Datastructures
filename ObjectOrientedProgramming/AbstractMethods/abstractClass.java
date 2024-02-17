package ObjectOrientedProgramming.AbstractMethods;

public abstract class abstractClass { // this is the parent class
    // abstract methods can not be declared as final, final keyword does not let you
    // change anything once declared
    // we cannot inherit using final keyword, and abstract classes are made to be
    // inherited.
    // what to do and not how to do it
    /**
     * 
     * Abstract classes give us a generalized form, it will act as the parent class
     * and let the child classes do what they want to do on its own.
     * -->> The purpose of the Abstract class is to provide a common definition of a
     * base class that multiple derived classes can share.
     * -->> Abstract classes does not have a body, and it totally depends on the
     * child classes to provide the body.
     * -->>An Abstract class is declared using "abstract" keyword.
     * --------abstract void prinInfo(); ----------
     * -->> Any class that contains one or more abstract methods must be declared as
     * abstract.
     */
    abstract void career();

    abstract void captain();

    abstract void info(); // we do not provide body here for abstract classes
    // these methods will be overriden by the parent class.
    // use case-->> If we know tha functions present in the parent class needs to be
    // Overriden, then
    // just make those abstract.

    int age; // we will assign it in child class

    public abstractClass(int age) {
        this.age = age;
    }
    // static methods do not get overriden, and abstract methods need to be
    // overriden, so we can not create the abstract methods for the static mathods

}
