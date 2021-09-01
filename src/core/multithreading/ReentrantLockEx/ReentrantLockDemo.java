package core.multithreading.ReentrantLockEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        CounterThreadsTask counterThreadsTask = new CounterThreadsTask();

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                counterThreadsTask.firstIncriminationThread();
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                counterThreadsTask.secondIncriminationThread();
            }
        });

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(counterThreadsTask.getCounter());
    }
}

class CounterThreadsTask {
    private int counter;
    private Lock reentrantLock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }
    }

    public void firstIncriminationThread() {
        reentrantLock.lock();
        increment();
        reentrantLock.unlock();
    }

    public void secondIncriminationThread() {
        reentrantLock.lock();
        increment();
        reentrantLock.unlock();
    }

    public int getCounter() {
        return counter;
    }
}
