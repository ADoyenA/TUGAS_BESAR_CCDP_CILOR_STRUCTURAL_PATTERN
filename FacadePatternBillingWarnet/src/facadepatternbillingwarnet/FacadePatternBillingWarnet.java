/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternbillingwarnet;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FacadePatternBillingWarnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama, paket, komputer;
        Operator op = new Operator();
        
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
            op.komputer1();
            op.paket1();
        } else if ((komputer.equals("1"))&&(paket.equals("2"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer1();
            op.paket2();
        } else if ((komputer.equals("1"))&&(paket.equals("3"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer1();
            op.paket3();
        } else if ((komputer.equals("2"))&&(paket.equals("1"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer2();
            op.paket1();
        } else if ((komputer.equals("2"))&&(paket.equals("2"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer2();
            op.paket2();
        } else if ((komputer.equals("2"))&&(paket.equals("3"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer2();
            op.paket3();
        } else if ((komputer.equals("3"))&&(paket.equals("1"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer3();
            op.paket1();
        } else if ((komputer.equals("3"))&&(paket.equals("2"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer3();
            op.paket2();
        } else if ((komputer.equals("3"))&&(paket.equals("3"))){
            System.out.println("Nama: " + nama);
            System.out.println("Komputer: " + komputer);
            System.out.println("Paket: " + paket);
            op.komputer3();
            op.paket3();
        } else {
            System.out.println("komputer atau paket tidak ada");
        }
        
        //System.out.println("Nama: " + nama);
        //System.out.println("Komputer: " + komputer);
        //System.out.println("Paket: " + paket);
        


        
    }
    
}
