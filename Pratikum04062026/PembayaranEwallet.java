/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum210526;

/**
 *
 * @author USER
 */
public class PembayaranEwallet extends Pembayaran implements CetakStruk{
    private String namaEwallet;

    public PembayaranEwallet(String namaEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEwallet = namaEwallet;
    }

    public String getNamaEwallet() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }
    
    @Override
    public void prosesPembayaran(){
      System.out.println("proses pembayaran melalui E-wallet");
      System.out.println("Nama E-wallet: "+namaEwallet);
      System.out.println("Id Transaksi: "+idTransaksi);
      System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
        
    }

    @Override
    public void cetak() {
      System.out.println("proses pembayaran melalui E-wallet");
      System.out.println("Nama E-wallet: "+namaEwallet);
      System.out.println("Id Transaksi: "+idTransaksi);
      System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
    }
    
    
}
