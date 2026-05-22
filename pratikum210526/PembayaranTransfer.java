/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum210526;

/**
 *
 * @author USER
 */
public class PembayaranTransfer extends Pembayaran {
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
      System.out.println("proses pembayaran secara transfer");
       System.out.println("Bank: "+namaBank);
        System.out.println("Id transaksi: "+idTransaksi);
         System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
      
    }
    
    
}
