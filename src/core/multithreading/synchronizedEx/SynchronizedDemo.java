package core.multithreading.synchronizedEx;

public class SynchronizedDemo extends Thread {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();

        Thread firstThread = new Thread(synchronizedDemo);
        Thread secondThread = new Thread(synchronizedDemo);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(synchronizedDemo.getCounter());

    }

    private synchronized void incrementCounter() {  //race condition off (synchronized this)
        counter++;
    }  //race condition off (synchronized this)

    public int getCounter() {
        return counter;
    }

    public void run() {
        for (int i = 0; i < 1_000_000; i++)
            incrementCounter();
    }

}

