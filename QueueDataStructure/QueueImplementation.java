package QueueDataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    /**
     * Queue-->>A queue is a linear data structure that is open at both ends and the
     * operation is performed
     * as first in first out.
     * All additions are made at the end and all deletions or removals are made at
     * the other endor at the front of the queue.
     * -->> Queue is an Interface that extends Collection Interface.
     * Being an Interface the queue needs a concreate class for the declaration and
     * the most common is priority queue.
     * Since queue is an interface Objects cannot be created of type queue. We need a class that extends this 
     * list in order to create object.
     * <-->> An Interface in java is defined as an abstract type used to specify the behavior of a class.
     * Interface in java is a mechanism to achieve abstraction.
     * 
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();  // LinkedList implements DeQueue which extends Queue
        queue.add(12);
        queue.add(21);
        queue.add(22);
        System.out.println(queue.peek());  // peek-->> gets the head of the queue but does not removes it
        System.out.println(queue.remove());  // removes the head of the queue
        System.out.println(queue.remove());    // 21

        Deque<Integer> deque = new ArrayDeque<>();  // ArrayDeque--> constructs an empty Array deque
        // with an initial capcatiy that can hold `6 elements
        // Deque comes handy when we have to print from left to right or from right to left
        deque.addFirst(12);
        deque.addLast(21);
        

    }
}
/**
 * Deque-->>It is an interface that extends queue, it is a linear data structure that supports
 * insertion and removal at the both ends.
 */
