package core.multithreading.SemaphoreEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Semaphore semaphore = new Semaphore(10);

        ConnectionSimulator connectionSimulator = ConnectionSimulator.getConnection();
        for (int i = 0; i < 200; i++) {
            int threadName = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        connectionSimulator.showSimulation();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                }
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
