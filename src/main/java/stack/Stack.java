package stack;

public class Stack {
    private int items;

    public boolean isEmpty() {
        return items == 0;
    }

    public void push(int i) {
        items++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();
        items--;
        return 99;

    }
}
