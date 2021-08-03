/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatternbillingwarnet;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DecoratorPatternBillingWarnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama, paket;
        
        
        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("### Pemilihan Billing ###");
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("Pilih Paket (1-3 atau Gadang): ");
        paket = keyboard.nextLine();
        
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        
        switch (paket){
            case "1":
                System.out.println("Nama: " + nama);
                System.out.println("Paket: " + paket);
                Paket paket1 = new Paket1();
                paket1.harga();
                paket1.waktu();
                break;
            case "2":
                System.out.println("Nama: " + nama);
                System.out.println("Paket: " + paket);
                Paket paket2 = new Paket2();
                paket2.harga();
                paket2.waktu();
                break;
            case "3":
                System.out.println("Nama: " + nama);
                System.out.println("Paket: " + paket);
                Paket paket3 = new Paket3();
                paket3.harga();
                paket3.waktu();
                break;
            case "Gadang":
                System.out.println("Nama: " + nama);
                System.out.println("Paket: " + paket);
                Paket paketGadang = new PaketGadang(new Paket3());
                paketGadang.harga();
                paketGadang.waktu();
                break;
            case "gadang":
                System.out.println("Nama: " + nama);
                System.out.println("Paket: " + paket);
                Paket paketgadang = new PaketGadang(new Paket3());
                paketgadang.harga();
                paketgadang.waktu();
                break;
            default:
                System.out.println("Maaf, Paket Tidak Ada");
                
                
        }
        
    }
    
}
