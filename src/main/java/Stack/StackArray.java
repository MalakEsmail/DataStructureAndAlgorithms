package Stack;

public class StackArray<T> {

    Object[] arrayStack;
    int size;
    int top;

    public StackArray(int size) {
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == - 1);
    }

    public void push(Object newItem) {
        if (isFull()) {
            System.out.println("stack is full");

            return;
        }
        top = top + 1;
        arrayStack[top] = newItem;
    }

    public T pop() {
        if (isEmpty()) {

            System.out.println("stack is empty");
            return null;
        }
        T item = (T) arrayStack[top];
        top = top - 1;
        return item;
    }

}
