package main;
import races.RacerThread;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            RacerThread racer = new RacerThread(i);
            
            if (i == 1) racer.setPriority(Thread.MIN_PRIORITY);   // prioridade mínima (1)
            if (i == 2) racer.setPriority(Thread.NORM_PRIORITY);  // prioridade normal (5)
            if (i == 3) racer.setPriority(Thread.MAX_PRIORITY);   // prioridade máxima (10)
            if (i == 4) racer.setPriority(Thread.MIN_PRIORITY);   // prioridade mínima (1)
            if (i == 5) racer.setPriority(Thread.NORM_PRIORITY);  // prioridade normal (5)
            if (i == 6) racer.setPriority(Thread.MAX_PRIORITY);   // prioridade máxima (10)
            if (i == 7) racer.setPriority(Thread.MIN_PRIORITY);   // prioridade mínima (1)
            if (i == 8) racer.setPriority(Thread.NORM_PRIORITY);  // prioridade normal (5)
            if (i == 9) racer.setPriority(Thread.MAX_PRIORITY);   // prioridade máxima (10)
            if (i == 10) racer.setPriority(Thread.MIN_PRIORITY);   // prioridade mínima (1)
            
            racer.start();
        }
    }
}