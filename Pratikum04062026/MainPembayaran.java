/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum210526;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainPembayaran {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Pembayaran pembayaran = null;
        CetakStruk c= null;
        
        System.out.println("Sistem Pembayaran Toko Dinda");
        System.out.println("----------------------------");
        System.out.println("Masukkan Id transaksi: ");
        String id = input.nextLine();
        
        System.out.println("Masukkan total pembayaran: ");
        double jumlah = input.nextDouble();
        input.nextLine();//clear buffer
        
        System.out.println("\nPilihan metode pembayaran");
        System.out.println("1.Pembayaran secara tunai");
        System.out.println("2.Pembayaran secara tranfer");
        System.out.println("3.Pembayaran secara kartu kredit");
        System.out.println("4.Pembayaran secara E-wallet");
        System.out.print("pilihan anda(1-4): ");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1:System.out.print("Inputkan jumlah uang: ");
                   double uang = input.nextDouble();
                   pembayaran = new PembayaranTunai(uang,jumlah,id);
                   c = (CetakStruk)pembayaran;
                   break;
            case 2:System.out.print("Masukkan nama Bank: ");
                   String nama = input.nextLine();
                   pembayaran = new PembayaranTransfer(nama,jumlah,id);
                     c = (CetakStruk)pembayaran;
                   break;   
            case 3:System.out.print("Masukkan nama kartu(MasterdCard,VisaCard): ");
                   String namaKartu= input.nextLine();
                   System.out.print("Masukkan no kartu: ");
                   String no= input.nextLine();
                   pembayaran = new PembayaranKredit(no,namaKartu,jumlah,id);
                     c = (CetakStruk)pembayaran;
                   break;
            case 4:System.out.print("Masukkan nama E-Wallet(Ovo,Dana,ShopeePay,Gopay): ");
                   String ewallet = input.nextLine();
                   pembayaran = new PembayaranEwallet(ewallet,jumlah,id);
                     c = (CetakStruk)pembayaran;
                   
                   break;        
            
        }
        
        System.out.println("Konfirmasi pembayaran");
        pembayaran.prosesPembayaran();
        
        System.out.println();
        c.cetak();
    }

   
}
