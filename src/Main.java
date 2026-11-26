/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Scaccia Lorenzo
 */
public class Main{
    public static void main(String args[]){
        System.out.println(" [0] Apertura banca");
        ContoCorrente contoComune = new ContoCorrente(50);
        ContoCorrente contoComune2 = new ContoCorrente(100)
        Correntista c1 = new Correntista(contoComune);
        Correntista c2 = new Correntista(contoComune);
        c1.start();
        c2.start();
        try{
            Thread.sleep(1500);
        }
        catch(InterruptedException e){
            System.err.println("[0] Errore nello sleep!");
        }
        System.out.println(" [0] Chiusura banca");
    }
}
