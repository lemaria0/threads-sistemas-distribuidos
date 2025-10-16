package races;

public class RacerThread extends Thread {
    private final int i;

    public RacerThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + i + " – imprimindo");
        }
    }
}