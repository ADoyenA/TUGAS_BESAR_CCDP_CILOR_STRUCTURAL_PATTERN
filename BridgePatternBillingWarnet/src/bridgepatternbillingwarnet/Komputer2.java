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
public class Komputer2 extends Komputer{

    public Komputer2(Paket paket) {
        super(paket);
    }
    
    

    @Override
    public void printOut() {
        paket.harga();
        paket.waktu();
        paket.waktuMulai();
    }
    
}
