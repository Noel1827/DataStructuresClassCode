import java.util.*;

public class QueueReverser {
    private ArrayQueue queue= new ArrayQueue(5);


    public ArrayQueue reverse(ArrayQueue queue, int NumItems) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < NumItems; i++)
            stack.push(queue.dequeue());

        while (!stack.isEmpty())
            this.queue.enqueue(stack.pop());

        while (!queue.isEmpty())
            this.queue.enqueue(queue.dequeue());
            
       return this.queue;
    }

}
