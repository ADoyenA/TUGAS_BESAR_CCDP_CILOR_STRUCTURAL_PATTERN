/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternbillingwarnet;

import java.security.PublicKey;

/**
 *
 * @author user
 */
public class Operator {
    
    private KomputerList komputer1;
    private KomputerList komputer2;
    private KomputerList komputer3;
    
    private PaketList paket1;
    private PaketList paket2;
    private PaketList paket3;

    public Operator() {
        komputer1 = new Komputer1();
        komputer2 = new Komputer2();
        komputer3 = new Komputer3();
        
        paket1 = new Paket1();
        paket2 = new Paket2();
        paket3 = new Paket3();
    }
    
    public void komputer1(){
        komputer1.ipAddres();

    }
    
    public void komputer2(){
        komputer2.ipAddres();
        
    }
    
    public void komputer3(){
        komputer3.ipAddres();
    }
    
    public void paket1(){
        paket1.harga();
        paket1.waktu();
    }
    
    public void paket2(){
        paket2.harga();
        paket2.waktu();
    }
    
    public void paket3(){
        paket3.harga();
        paket3.waktu();
    }
    
    
}
