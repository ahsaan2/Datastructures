
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
        /*
         * Now this slow and fast pointer can also be used to find the length of the cycle 
         * So how do we do that --> we know that in this method the slow and fast pointer do meet each pther
         * So, Once the pointers are met keep the fast pointer there only and keep moving the slow pointer 
         * till it reaches to the place where fast pointer is as we have already kept fast pointer static
         * fast pointer ---> till -->> slow pointer --> length
         
         */
        // algorithm to find the length of the cycle
        /**
         * Node slow = head;
         * Node fast = head;
         * while(slow != null && fast.next!=null){
         * slow = slow.next;
         * fast = fast.next.next;
         * // first check for the cycle
         * if(slow == fast){
         * // we have found the cycle
         * now move the slow pointer
         * int length =0;
         * Node temp = slow;
         * do{
         * temp = slow.next;
         * length ++;
         * // keep moving the temp till it reaches back to slow or fast
         * while(temp!=slow)
         * }
         * 
         * }
         * }
         * 
         *  --> One more important thing suppose we are running a marathon, One person runs with the speed of x (slow)
         * and another person runs with the speed of sx (fast). When the person reaches at the end of the marathon the person 
         * that suns slow will be in the mid of the racing marathon
         * <--> Same happens with the fast and slow pointer , when fast pointer reaches to the null slow pointer points 
         * to the middle of linked list and when we return slow it will give us the path till fast pointer or till end
         * <--> That is slow and fast pointer can also give us the middle of the linked list
         * 
         * 
         */


