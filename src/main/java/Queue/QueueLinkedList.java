package Queue;

import DoubleLinkedList.NodeD;

public class QueueLinkedList<T> {

    NodeD rear;
    NodeD front;

    public QueueLinkedList() {
        rear = null;
        front = null;
    }

    public void queue(Object value) {
        NodeD newNode = new NodeD(value, null, null);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            newNode.next = null;
            newNode.previous = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T deQueue() {
        if (rear == null || front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        T value=(T) front.value;
        front=front.next;
        if(front!=null)
        front.previous=null;
        return value;
    }

}
