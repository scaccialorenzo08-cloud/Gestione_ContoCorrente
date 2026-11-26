/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scaccia Lorenzo
 */
class ContoCorrente{
    protected int saldo;

    /**
     * apertura conto con saldo iniziale
     *
     * @param saldo
     */
    public ContoCorrente(int saldo)
    {
        this.saldo=saldo;
    }

    /**
     * lettura saldo conto
     *
     * @return saldo
     */
    int getSaldo()
    {
        return saldo;
    }

    /**
     * deposito di una sommma data
     *
     * @param somma
     */
    synchronized void deposito(int somma){
        saldo+=somma;
        System.out.println(Thread.currentThread() + " Deposito:"+somma+" saldo:"+saldo);
    }

    /**
     * prelievo di una somma data se disponibile
     *
     * @param somma
     */
    synchronized void prelievo(int somma){
        if(saldo>=somma){
            saldo-=somma;
            System.out.println(Thread.currentThread() + " Prelievo:"+somma+" saldo:"+saldo);
        }
    }

    synchronized void stampaSaldo(){
        System.out.println("il tuo saldo è di:"saldo"$")

    }
}