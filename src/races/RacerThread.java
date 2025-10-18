package races;

public class RacerThread extends Thread {
    private final int i;

    public RacerThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int c = 1; c <= 1000; c++) {
            System.out.println("Racer " + i + " – imprimiu " + c + " vezes");
        }
    }
}