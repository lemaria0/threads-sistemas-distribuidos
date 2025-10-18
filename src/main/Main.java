package main;
import entidades.Deposito;
import entidades.Produtor;
import entidades.Consumidor;

public class Main {

    public static void main(String[] args) {
        Deposito dep = new Deposito();

        Produtor p = new Produtor(dep, 50); // produz a cada 50 ms

        Consumidor c1 = new Consumidor(dep, 200, "1"); // tenta consumir a cada 200 ms
        Consumidor c2 = new Consumidor(dep, 150, "2"); // tenta consumir a cada 150 ms
        Consumidor c3 = new Consumidor(dep, 100, "3"); // tenta consumir a cada 100 ms
        Consumidor c4 = new Consumidor(dep, 200, "4"); // tenta consumir a cada 200 ms
        Consumidor c5 = new Consumidor(dep, 150, "5"); // tenta consumir a cada 150 ms

        p.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        
        // para aguardar a reprodução das threads
        try {
            p.join();
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Execucao da main terminada");
    }
}