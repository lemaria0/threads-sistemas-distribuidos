package entidades;

public class Produtor extends Thread {
    private final Deposito deposito;
    private final int tempoEntreProducoes;

    public Produtor(Deposito deposito, int tempoEntreProducoes) {
        this.deposito = deposito;
        this.tempoEntreProducoes = tempoEntreProducoes;
    }

    @Override
    public void run() {
        int produzidos = 0;
        while (produzidos < 100) {
            boolean resposta = deposito.colocar();
            if (resposta) {
                produzidos++;
                System.out.println("[Produtor] produziu. Total produzido: " + produzidos + " / Deposito possui: " + deposito.getNumItens() + "\n");
            }
            try {
                Produtor.sleep(tempoEntreProducoes);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("        [Produtor] terminou.\n");
    }
}