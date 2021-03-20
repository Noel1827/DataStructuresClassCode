import java.util.*;

public class TwoStackQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int number) {
        stack1.push(number);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException();
        MoveStack1toStack2();
        return stack2.pop();
    }

    private void MoveStack1toStack2() {
        if (!stack2.isEmpty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException();

        MoveStack1toStack2();
        return stack2.pop();
    }

}
