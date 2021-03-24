import java.util.LinkedList;
public class LinkedListQueue {
   private LinkedList<Integer> items = new LinkedList<>();

    public void enqueue(int item){
        items.add(item);
    }

    public int dequeue(){
        return items.removeFirst();
    }

    public int peek(){
        return items.getFirst();
    }

    public int size(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void print(){
        for(int i:items){
            System.out.println(i);
        }
    }
}
