public class StackMain {
    public static void main(String[] args) {
        TwoStack twostack = new TwoStack();
        twostack.push1(1);
        twostack.push2(2);
        twostack.push1(3);
        twostack.push2(4);
        twostack.push1(5);
        twostack.push2(6);
        twostack.push1(7);
        twostack.push2(8);
        System.out.println(twostack);
        twostack.pop1();
        twostack.pop2();
        System.out.println(twostack);
    }
}
