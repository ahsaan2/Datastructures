package StackDataStructure;

class demo extends Thread { // once we extend this class with the thread, it does not remain the normal
                            // class, but it becomes the thread
    public void run() {
        for (int i = 0; i < 100; i++) {  // we can see now the output is somehow printed as they are running in parallel.
            System.out.println("Hii");

        }
    }
}
// all the threads do not run at the same, the threads run are decided by the scheduler.Its scheduler's job to execute which thread.
class demo1 extends Thread {
    public void run() {  // start calls the run method
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");

        }
    }
}

public class threadsDemo {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo1 obj2 = new demo1();
        obj1.start(); // once the execution is in the main method, the show method is called and the
                     // execution will go to the show
        // method in class demo. The program execution will return only to the main
        // method when the execution of the show method in
        // first class gets over.
        // After that the execution will come back to the main method and now the method
        // 2 of the second class will be called.
        obj2.start();  // these run in the sequence.(Cause of threads we can run them in parallel)
        // so, here what happens is that first one method gets complete and then another
        // method gets complete.The methods are not run
        // parallel to each other.
        // If we want the methods to run parallel to each other , we can use
        // threads(multiple threads).
        // -->> So, how do we make the normal objects as threads=> Just extend the class
        // with the thread
    }
    /**
     * A thread is a direction or path that is taken while a program is being
     * executed. Generally, all the programs have atleast
     * one thread known as the main thread.
     * Threads allow a program to work more efficiently by doing multiple things at
     * the same time.
     * Threads can be used to perform complicated tasks in the background without
     * effecting the main program.
     */
    /**
     * In java there are two ways, we can use threads
     * 1. We can extend the thread class and then ovrride its run() method.
     * 2. Another way to create a thread is by implementing the Runnable interface.
     */
    // threads help in running multiple programs at a time or it helps in
    // multitasking.
}
/**
 * To run the above methods in parallel, main method need to have 2 threads one thread points to one show method and another thread\
 * points to another show method.
 * // we need to use the start() method for having the start/having the thread, or creates the new thread.
 * Start method call the run method and not the show or any method we create, so, once we use the threads, we start the 
 * thread using start() and this start calls the runt() method. So, every program where we use threads, need to have the run method.
 * Now, the methods are running in parallel and for small data we will get the output like they are running in a sequence, because the 
 * machines are so fast.
 * We can also increase the loopp condition to check for the parallel working of threads
 */
