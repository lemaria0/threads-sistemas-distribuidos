package main;
import races.RacerRunnable;
import races.RacerThread;

public class Main {
    public static void main(String[] args) {

        // --- interface Runnable ---
        Thread t1 = new Thread(new RacerRunnable(1));

        // --- extensão da classe Thread  ---
        RacerThread t2 = new RacerThread(2);

        // iniciando as threads
        t1.start();
        t2.start();
    }
}
