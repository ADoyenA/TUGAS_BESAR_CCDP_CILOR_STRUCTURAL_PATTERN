/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbillingwarnet;

/**
 *
 * @author user
 */
public abstract class Komputer {
    
    protected Paket paket;

    protected Komputer(Paket paket) {
        this.paket = paket;
    }
    
    public abstract void printOut();
    
    
}
