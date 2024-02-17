package ObjectOrientedProgramming.Interface;

public interface Engine {   // will have stop, start and accelerate
    static final int PRICE = 7900;
    void start();
    void stop();
    void accelerate();
    
}/**
 * Interface contains abstract functions(no body is present),
 * variables are static and by default final in interfaces.
 * Abstract class can provide the implementation of the interface, and interface
 * cannot
 * provide the implementation of the abstract class.
 * The interface in java is a mechanism to achieve abstraction(what to do, not
 * how to do it).
 * To declare interface we use the keyword "interface".
 * All the methods in the interface are declared with an empty body and all the
 * fields are public static , and final by default.
 * Through interface we can achieve multiple inheritance.
 * class ---->> "extends" class.
 * class ---->> "implements" interface.
 * interface ---->> "extends" interface.
 */
