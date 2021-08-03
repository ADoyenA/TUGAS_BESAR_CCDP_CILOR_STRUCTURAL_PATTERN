/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbillingwarnet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Paket3 implements Paket{
    
    
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }

    @Override
    public void harga() {
        System.out.println("Harga: 15000");
    }

    @Override
    public void waktu() {
        System.out.println("Waktu: 3 Jam");
    }
    
    @Override
    public void waktuMulai() {
        System.out.println("Waktu Mulai: " + getWaktu());
    }


}
