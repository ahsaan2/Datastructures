
    /**
     * Cycle detection method is a method by which we can find if the cycle exists
     * or not
     * What exactly is a cycle--> when we reach back to the node which we have
     * already traversed
     * This method is also known as a fast and slow pointer(Floyd's method)
     * This approach is best suited to detect a cycle and to find the node in the
     * cycle
     * 
     * --> so, How does this approach work--> both the slow and fast pointer start from the head and 
     * slow pointer moves forward by one step and the fast pointer moves ahead by two steps
     * when ever the fast pointer and slow pointer meet or they traverse the same node twice then we have a loop
     * or we can say that we have a circle present
     *
     */
    /**  code of the fast and slow pointer
     * public boolean hasCycle(Node head){
        Node slow = head;
        Node fast= head;
        // now here we have a condition if any of the pointer reaches to the null then the loop is not present
        while (slow != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
                
            }
        }

    }


     */