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
public class PaketGadang extends PaketDecorator{
    
    
    public PaketGadang(Paket paket) {
        super(paket);
    }


    @Override
    public void waktu() {
        paket.waktu();
        tambahWaktu();
    }

    @Override
    public void harga() {
        paket.harga();
    }
    
    private void tambahWaktu(){
        System.out.println("Tambahan: 4 jam");
        System.out.println("Total Waktu: 9 jam");
        System.out.println("Syarat: Dari jam 21.00-06.00");
    }
    
    
    
}
