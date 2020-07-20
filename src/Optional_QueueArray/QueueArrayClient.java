package Optional_QueueArray;

public class QueueArrayClient {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(4);
        queue.dequeue();
        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
    }
}
