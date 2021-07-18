package Queue;

public class QueueArray<T> {

    Object[] arrayQueue;
    int size;
    int front;
    int rear;

    public QueueArray(int size) {
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
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        rear = rear + 1;
        arrayQueue[rear] = newItem;
        if (front == -1) {
            front = 0;
        }
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
