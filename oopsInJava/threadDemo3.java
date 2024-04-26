package oopsInJava;
class thread1 extends Thread{
    //once we create a thread, we have to ovverride the run method
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I am in the first thread:");
            // once the first statement is printed, we can make it wait for some seconds, to go to the next thread,
            // if we have multiple threads
            try {
                // try to sleep the thread for some time
                Thread.sleep(1000);
            } catch (Exception e) {
              e.getStackTrace();  // returns an array of stack trace.
            }
        }
       
    }
}
// we create another class with another thread
class thread2 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I am in thread 2:");
            // now we can make this thread wait for some time
           try {
            Thread.sleep(1000);
           } catch (Exception e) {
           e.getStackTrace();
           }
        }
    }
}
// we can check for the priority
class thread3 extends Thread{
    public void run(){
        System.out.println("I am the priority thread:");
        try {
            Thread.sleep(1000);;
        } catch (Exception e) {
          
            e.getStackTrace();
        }
    }
}

public class threadDemo3{
    public static void main(String[] args) {
        // creating the objects of the thread
    thread1 obj1 = new thread1();
        obj1.start();  // this will start the thread and it will call the run method.
        // start is used for starting the thread, and it calls the run method of the Thread class
        thread2 obj2 = new thread2();
        obj2.start();  // calls the run method of the thread 2
        // here we can see the output of both the threads in parallel, executing one after another
        // because of the try block where we sleep the threads for some time, after the first execution.
        
    }
}
