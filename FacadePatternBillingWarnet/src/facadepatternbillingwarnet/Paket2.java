/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternbillingwarnet;

/**
 *
 * @author user
 */
public class Paket2 implements PaketList{

    @Override
    public void harga() {
        System.out.println("Harga: 10000");
    }

    @Override
    public void waktu() {
        System.out.println("Waktu: 120 Menit");
    }
    
}
