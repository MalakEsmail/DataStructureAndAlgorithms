/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author malak
 */
public class QueueArrayDemo {

    public static void main(String[] args) {
        QueueArray<Integer> q = new QueueArray<Integer>(5);
        q.Queue(5);
        q.Queue(2);
        q.Queue(4);
        q.Queue(7);
        q.Queue(6);
        System.out.println("DeQueueu :"+q.deQueue());
        System.out.println("DeQueueu :"+q.deQueue());
    
    }
}
