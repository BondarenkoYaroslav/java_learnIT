package core.multithreading.ThreadPoolEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            executorService.submit(new SimulationWork(i));
        }

        executorService.shutdown();
        System.out.println("main work is over");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class SimulationWork implements Runnable {
    private final int id;

    public SimulationWork(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(id + " thread exited.");
    }
}
