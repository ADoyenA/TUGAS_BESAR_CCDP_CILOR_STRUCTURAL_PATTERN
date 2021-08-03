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
public class Paket1 implements Paket{

    @Override
    public void harga() {
        System.out.println("Harga: 5000");
    }

    @Override
    public void waktu() {
        System.out.println("Waktu: 1 Jam");
    }
    
}
