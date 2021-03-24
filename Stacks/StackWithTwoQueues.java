import java.util.LinkedList;
import java.util.Queue;
public class StackWithTwoQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    private int top;

    public void push(int item){
        queue1.add(item);
    }

    public int pop(){
        if(isEmpty())
        throw new IllegalStateException();
        while(queue1.size()>1){
            top = queue1.remove();
            queue2.add(top);
        }
        SwapQueues();

        return queue2.remove();
    }

    private void SwapQueues() {
        var temp = queue1;
        queue1= queue2;
        queue2= temp;
    }

    public int peek(){
        if(queue1.isEmpty())
        throw new IllegalStateException();
        return top;
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    @Override
    public String toString(){
        return queue1.toString();
    }

}
