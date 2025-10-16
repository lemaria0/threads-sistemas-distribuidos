package races;

public class RacerRunnable implements Runnable {
    private final int i;

    public RacerRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + i + " – imprimindo");
        }
    }
}