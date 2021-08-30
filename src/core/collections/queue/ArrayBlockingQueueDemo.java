package core.collections.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> blockQueue = new ArrayBlockingQueue<>(5);

        blockQueue.offer(1);
        blockQueue.offer(2);
        blockQueue.offer(3);
        blockQueue.offer(4);
        blockQueue.offer(5);
//        FIFO
        while (blockQueue.peek() != null) {
            System.out.println("Remove element: " + blockQueue.poll());
        }
    }
}
