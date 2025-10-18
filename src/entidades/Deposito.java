package entidades;

public class Deposito {
    private int itens = 0;
    private final int capacidade = 100;

    public int getNumItens(){
        return itens;
    }
    
    public boolean retirar() {
        //if (getNumItens() > 0) {
            itens--;
            return true;
        //}
        //return false;
    }
    
    public boolean colocar() {
        if (getNumItens() < capacidade) {
            itens++;
            return true;
        }
        return false;
    }
}