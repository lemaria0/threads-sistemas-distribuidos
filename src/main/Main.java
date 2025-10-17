package main;
import races.RacerThread;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            RacerThread racer = new RacerThread(i);
            racer.start();
        }
    }
}