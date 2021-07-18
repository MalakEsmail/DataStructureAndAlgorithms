package Queue;

public class QueueDynamicArrayDemo {

    public static void main(String[] args) {
        QueueDynamicArray<Integer> q = new QueueDynamicArray<Integer>(2);
        q.Queue(12);
        q.Queue(10);
        System.out.println("queue size" + q.getSize());
        q.Queue(15);
        System.out.println("queue size" + q.getSize());

    }
}
