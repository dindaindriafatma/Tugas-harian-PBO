/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum09042026;

/**
 *
 * @author USER
 */
public class AkunBankEnkapsulasi {
   private String norekening ;
    private String nama;
    private double saldo;
    
    public AkunBankEnkapsulasi(){
    }
    public AkunBankEnkapsulasi(String norek, String nma,double sald ){
       norekening = norek; 
       nama = nma;
       saldo = sald;
    }
    public String getNoRekening(){
        return norekening;
    }
    public void setNoRekening(String norek){
        this.norekening = norek;
    }
    public String getNama(){
       return nama;
    }
    public void setNama(String nma){
        this.nama = nma;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double sald){
        this.saldo = sald;
    }
    public void deposit(double jumlah){
        if(jumlah > 0){
        saldo = saldo + jumlah;
        System.out.println("Deposit Rp."+jumlah+" Berhasil");
        }
        else{
            System.out.println("Deposit Tidak Valid");
            
        }
    }     
        public void withdraw(double jumlah){
        if(jumlah > saldo){
            System.out.println("Saldo Tidak Cukup");
         
        }
        else if(jumlah > 0){
            saldo = saldo - jumlah;
            System.out.println("Withdraw Sebesar Rp."+jumlah+" Berhasil");
            
        }
        else {
            System.out.println("Jumlah yang dimasukan tidak valid");
        } 
    }
    public void TampilkanInfo(){
        System.out.println("Nama Nasabah = "+nama);
        System.out.println("No Rekening= "+norekening);
        System.out.println("Saldo = Rp."+saldo); 
    
    } 
    
    
}
    
    

    

