package oopsInJava;

class demoThread extends Thread {
    public void run() { // every thread calls the run method only
        for (int i = 0; i < 100; i++) {
            System.out.println("I am the thread first:");
            // we can also wait the thread for a particular time, once we print the above
            // message we want the thread go to the sleep
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }
}

class demoThread2 extends Thread { // to make the class thread we have to extend the Thread
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am the thread second");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}

public class threadDemo2 {
    public static void main(String[] args) {
        demoThread obj1 = new demoThread();
        demoThread2 obj2 = new demoThread2();
        // obj1.show(); // instead of calling the show method, we have to start the
        // thread, and this start will call the run method only
        // here we will look at the thread priority-->> Threads are used or work in
        // accordance with the scheduler.

        System.out.println(obj1.getPriority()); // will give the priority of 5
        // the priority range from 1 to 10, 1 is the least priority and 10 is the
        // highest priority.
        // By default we have a normal priority of the thread

        obj1.start();
        obj2.start();
        // --> We can set the priority ad we desire, using set priority

        obj2.setPriority(10); // set the priority for object 2 as 10(highest-> means only this will get
                              // executed first)

        // to execute the thread we have to use the start method that starts the thread
        // start method in thread will only call the run method, thus in every thread
        // program we need to have a run method
    }

}
