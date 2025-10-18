package entidades;

public class Consumidor extends Thread {
    private final Deposito deposito;
    private final int tempoEntreConsumos;

    public Consumidor(Deposito deposito, int tempoEntreConsumos, String nome) {
        super(nome);
        this.deposito = deposito;
        this.tempoEntreConsumos = tempoEntreConsumos;
    }

    @Override
    public void run() {
        int consumidos = 0;
        while (consumidos < 20) {
            boolean resposta = deposito.retirar();
            if (resposta) {
                consumidos++;
                System.out.println("    [Consumidor " + this.getName() + "] consumiu. Total consumido: " + consumidos + " / Deposito possui: " + deposito.getNumItens() + "\n");
            }
            try {
                Consumidor.sleep(tempoEntreConsumos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("        [Consumidor " + this.getName() + "] terminou.\n");
    }
}