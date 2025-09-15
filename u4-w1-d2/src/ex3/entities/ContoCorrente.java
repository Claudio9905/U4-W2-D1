package ex3.entities;

import ex3.exceptions.BancaException;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo){
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {

        nMovimenti++;
        if(saldo - x < 0){
            throw new BancaException("Il conto è in rosso");
        }
        if (nMovimenti < maxMovimenti){
        saldo -= x;
        }

    }

    public double restituisciSaldo(){
        return saldo;
    }

}
