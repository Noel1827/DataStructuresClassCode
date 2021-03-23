import java.util.*;

public class Main {
    public static void main(String args[]) {
        // TwoStackQueue queue = new TwoStackQueue();
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();
        // queue.dequeue();
        // var first = queue.dequeue();
        // System.out.println(first);

        // PriorityQueue queue = new PriorityQueue();
        // queue.add(5);
        // queue.add(3);
        // queue.add(6);
        // queue.add(1);
        // queue.add(4);
        // while(!queue.isEmpty()){
        // System.out.println(queue.remove());
        // }
        // System.out.println(queue);

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
     
        
        QueueReverser reverser = new QueueReverser();
        queue = reverser.reverse(queue, 2);
        System.out.println(queue);
        
    }
}
