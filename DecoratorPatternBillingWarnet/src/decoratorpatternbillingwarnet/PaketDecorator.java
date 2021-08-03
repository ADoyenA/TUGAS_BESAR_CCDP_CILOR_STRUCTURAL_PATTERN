/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatternbillingwarnet;

/**
 *
 * @author user
 */
public abstract class PaketDecorator implements Paket {
    
    protected Paket paket;

    public PaketDecorator(Paket paket) {
        this.paket = paket;
    }

    @Override
    public void harga() {
        this.paket.harga();
    }

    @Override
    public void waktu() {
        this.paket.waktu();
    }
         
}
