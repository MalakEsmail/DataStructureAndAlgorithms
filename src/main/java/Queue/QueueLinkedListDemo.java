package Queue;

public class QueueLinkedListDemo {

    public static void main(String[] args) {
        QueueLinkedList<String> q = new QueueLinkedList<String>();
        q.queue("malak"
        );
        q.queue("Sara"
        );
        q.queue("lala"
        );
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
