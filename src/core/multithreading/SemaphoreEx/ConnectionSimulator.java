package core.multithreading.SemaphoreEx;

//  Singleton
public class ConnectionSimulator {
    private static ConnectionSimulator connectionSimulator = new ConnectionSimulator();


    private ConnectionSimulator() {
    }

    public static ConnectionSimulator getConnection() {
        return connectionSimulator;
    }

    public void showSimulation() {
        System.out.println(Thread.currentThread().getName() + " has made a successful connection.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
