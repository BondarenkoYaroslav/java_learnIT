package core.multithreading.ThreadEx;

public class ThreadDemo {
    public static void main(String[] args) {
        SpamThread spamThread = new SpamThread();
        spamThread.start();

        try {
            spamThread.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(spamThread.tryStopSpam());
    }
}

class SpamThread extends Thread {
    private volatile boolean stopSpam = false;

    public boolean tryStopSpam() {
        stopSpam = true;
        return stopSpam;
    }

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