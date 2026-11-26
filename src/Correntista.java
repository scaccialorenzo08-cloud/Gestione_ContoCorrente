/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Scaccia Lorenzo
 */
class Correntista extends Thread{
    ContoCorrente conto;
    int saldo;
    int noperazioni;

    /**
     * creazione del Correntista della banca associato ad un ContoCorrente
     *
     * @param c
     */
    Correntista(ContoCorrente c){
        conto = c;
        noperazioni = 4;
    }

    @Override
    public void run(){
        int i = 0;
        while(i < noperazioni){
            conto.deposito(100);
            conto.prelievo(200);
            i++;
        }

    }
}