/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbillingwarnet;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BridgePatternBillingWarnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
       String nama, paket, komputer;
        
        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("### Pemilihan Billing ###");
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("Pilih Komputer (1-3): ");
        komputer = keyboard.nextLine();
        System.out.print("Pilih Paket (1-3): ");
        paket = keyboard.nextLine();
        
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        
        if ((komputer.equals("1"))&&(paket.equals("1"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer1 = new Komputer1(new Paket1());
            komputer1.printOut();
        } else if ((komputer.equals("1"))&&(paket.equals("2"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer1 = new Komputer1(new Paket2());
            komputer1.printOut();
        } else if ((komputer.equals("1"))&&(paket.equals("3"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer1 = new Komputer1(new Paket3());
            komputer1.printOut();
        } else if ((komputer.equals("2"))&&(paket.equals("1"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer2 = new Komputer2(new Paket1());
            komputer2.printOut();
        } else if ((komputer.equals("2"))&&(paket.equals("2"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer2 = new Komputer2(new Paket2());
            komputer2.printOut();
        } else if ((komputer.equals("2"))&&(paket.equals("3"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            Komputer komputer2 = new Komputer2(new Paket3());
            komputer2.printOut();
        } else {
            System.out.println("komputer atau paket tidak ada");
        }
    }
    
}
