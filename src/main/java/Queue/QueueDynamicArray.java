package Queue;

import java.util.Arrays;

public class QueueDynamicArray<T> {

    Object[] arrayQueue;
    int size;
    int front;
    int rear;
    int newCapacity;

    public QueueDynamicArray(int size) {
        this.size = size;
        arrayQueue = new Object[this.size];
        front = -1;
        rear = -1;
    }

    public Boolean isFull() {
        return (rear == size - 1);
    }

    public Boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public void Queue(Object newItem) {
        ensureCapacity(rear + 2);
        rear = rear + 1;
        arrayQueue[rear] = newItem;
        if (front == -1) {
            front = 0;
        }
    }

    public int getSize() {
        return arrayQueue.length;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity) {
            newCapacity = oldCapacity * 2;
        }
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        arrayQueue = Arrays.copyOf(arrayQueue, newCapacity);

    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        T objectOut = (T) arrayQueue[front];
        front = front + 1;
        return objectOut;
    }
}
