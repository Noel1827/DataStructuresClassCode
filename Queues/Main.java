public class Main {
    public static void main(String args[]){
        TwoStackQueue queue = new TwoStackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        var first = queue.dequeue();
        System.out.println(first);
    }
}
