package main;
import races.RacerThread;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<RacerThread> impares = new ArrayList<>();

        // iniciar todos os ímpares
        for (int i = 1; i <= 10; i += 2) {
            RacerThread racer = new RacerThread(i);
            racer.start();
            impares.add(racer); // guarda
        }

        // esperar todos os ímpares terminarem
        for (RacerThread r : impares) {
            try {
                r.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // depois iniciar os pares
        for (int i = 2; i <= 10; i += 2) {
            RacerThread racer = new RacerThread(i);
            racer.start();
        }
    }
}