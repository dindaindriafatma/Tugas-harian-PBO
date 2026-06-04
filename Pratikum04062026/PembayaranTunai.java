/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum210526;

/**
 *
 * @author USER
 */
public class PembayaranTunai extends Pembayaran implements CetakStruk {
 
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }

    
    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }
    
    @Override
     public void prosesPembayaran() {
      System.out.println("proses pembayaran secara tunai");
      System.out.println("Id Transaksi: "+idTransaksi);
      System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
      System.out.println("Uang yg diberikan:Rp. "+uang);
      if(uang>jumlahBayar){
          double kembalian=uang-jumlahBayar;
          System.out.println("proses pembayaran berhasil!!");
          System.out.println("Uang Kembalian:Rp. "+kembalian);
          
      }
      else{
          double kekurangan = jumlahBayar-uang;
          System.out.println("Proses Pembayaran gagal!!!");
          System.out.println("Uang anda kurang sebanyak:Rp. "+kekurangan);
      }
    
      
     }

    @Override
    public void cetak() {
      System.out.println("Struk Pembayaran Tunai");
      System.out.println("Id Transaksi: "+idTransaksi);
      System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
      System.out.println("Uang yg diberikan:Rp. "+uang);
      if(uang>jumlahBayar){
          double kembalian=uang-jumlahBayar;
          System.out.println("proses pembayaran berhasil!!");
          System.out.println("Uang Kembalian:Rp. "+kembalian);
          
      }
      else{
          double kekurangan = jumlahBayar-uang;
          System.out.println("Proses Pembayaran gagal!!!");
          System.out.println("Uang anda kurang sebanyak:Rp. "+kekurangan);
      }
    
       
    }
}
