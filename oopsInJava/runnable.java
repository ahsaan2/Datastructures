package oopsInJava;

class threadDemo4 implements Runnable { // Runnable has abstract method run.
    // once we implement the Runnable, we can't use the start method, because
    // Runnable does not have start method
    // this start method was coming from Thread
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am in thread 1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

}

class threadDemo5 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am in thread 2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

public class runnable {
    // Thread is a class which implements Runnable
    // So, instead of extending Thread, we can implement Runnable
    public static void main(String[] args) {
        // we can create the reference of the interface and object of a class
        Runnable obj1 = new threadDemo4();
        Runnable obj2 = new threadDemo5();

        // so here what we can do, is that we can create 2 different thread
        Thread t1 = new Thread(obj1);  // passing the Runnable objects
        Thread t2 = new Thread(obj2);
        t1.start(); // no we can call the start method using the thread reference
        // we cannot use start method
        t2.start();
    }

}
/**
 *  -----------------------------Different States of the Thread-----------------------------------------------
 * 1. New State-->> Every time we create a thread it is in the new state,The thread has not yet started to run in this state.
 * 2. Runnable State-->> A thread that is ready to run is moved to the runnable state.In this state a thread might be actually running
 * or ready to run.
 * 3. Running State-->> This state means the CPU has allocated the time slot for the execution of the thread. when the scheduler selects
 * the thread from the runnable state it goes into the running state.
 * 4. Blocked-->> A thread is considered to be in blocked state when it is in Sleep/Suspend or waiting state. Threades go in the\
 * blocked state to satisfy some conditions.
 * 5.Dead State-->> A thread dies or moves into dead state when its run() method completes the exectution of the statements.
 * 
 */