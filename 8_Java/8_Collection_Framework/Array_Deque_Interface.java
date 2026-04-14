import java.util.*;
public class Array_Deque_Interface {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();

        // Single Ended Queue
        
        //insertion of elements
        queue.add(10); // it'll throw exception if it can't add element
        queue.offer(20); // it'll not throw any exception, just return false.
        queue.offer(30);


        // Top element

        // both will give first element
        System.out.println(queue.peek()); // it'll not gonna throw error if there doesn't exist any element and have null value.
        System.out.println(queue.element()); // it'll throw error if there are no element present in queue.

        // removing element
        queue.remove(); // throw exception if no element exist in queue.
        queue.poll(); // safer version.
        
    }
}
