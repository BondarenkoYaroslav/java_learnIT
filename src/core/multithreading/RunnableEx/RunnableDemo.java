package core.multithreading.RunnableEx;

import static java.lang.Thread.sleep;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread spamRun = new Thread(new SpamRunnable());
        spamRun.start();

        try {
            spamRun.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(SpamRunnable.tryStopSpam());
    }
}

class SpamRunnable implements Runnable {
    private volatile static boolean stopSpam = false;

    public static boolean tryStopSpam() {
        stopSpam = true;
        return stopSpam;
    }

    @Override
    public void run() {
        while (!stopSpam) {
            System.out.println("DO YOU LIKE SPAM?");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
