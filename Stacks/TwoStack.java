import java.util.Arrays;

class TwoStack {
    private int[] stack = new int[10];
    private int count1 = 0, count2 = 1, size=0;

    public boolean isEmpty1() {return count1 == 0;}

    public boolean isEmpty2() {return count2 == 0;}

    public boolean isFull1() {return count1 >= stack.length;}

    public boolean isFull2() {return count2 >= stack.length;}

    public void push1(int item) {
        if (isFull1()) throw new StackOverflowError();

        stack[count1] = item;
        count1 += 2;
        size++;
    }

    public void push2(int item) {
        if (isFull2())throw new StackOverflowError();

        stack[count2] = item;
        count2 += 2;
        size++;
    }

    public int pop2() {
        if (isEmpty2()) throw new IllegalStateException();
        int temp = stack[count2-2];
        count2 -= 2;
        size--;
        return temp;
    }

    public int pop1() {
        if (isEmpty1()) throw new IllegalStateException();
        int temp = stack[count1-2];
        count1 -= 2;
        size--;
        return temp;
    }
    @Override
    public String toString(){
        var copy = Arrays.copyOfRange(stack, 0,size);
        return Arrays.toString(copy);
    }

    public void print1(){
        for(int i = 0; i < count1; i+=2){
            System.out.println(stack[i]);
        }
    }
    public void print2(){
        for(int i = 1; i < count2; i+=2){
            System.out.println(stack[i]);
        }
    }


}