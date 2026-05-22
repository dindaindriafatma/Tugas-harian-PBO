/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum09042026;

/**
 *
 * @author USER
 */
public class MahasiswaEnkapsulasi {
     private String nama;
   private String nim;
   private String jurusan;
   private int umur = 0;
   private double ipk = 0;
   private static int jumlahObjek = 0;
    
    //constructor
    public MahasiswaEnkapsulasi(){
        jumlahObjek ++;
    }
    
    //constructor 2 - overloading
    public MahasiswaEnkapsulasi(String nm, String nimmhs){
        this.nama = nm;
        this.nim = nimmhs;
        this.jumlahObjek ++;
        
    }
    public MahasiswaEnkapsulasi(String nm, String nimmhs,String jrsn, int umr, double ipkmhs){
        this.nama = nm;
        this.nim = nimmhs;
        this.jurusan = jrsn;
        this.umur = umr;
        this.ipk = ipkmhs; 
        this.jumlahObjek ++;
    }
    //GETTER DAN SETTER
    public void setNama(String namaMhs){
        this.nama = namaMhs;
        
    }
     public String getNama(){
        return nama;
    }
    public void setNim(String nimMhs){
        this.nim = nimMhs;
        
    }
     public String getNim(){
        return nim;
    }
    public void setJurusan(String jurusanMhs){
        this.jurusan = jurusanMhs;
        
    }
     public String getJurusan(){
        return jurusan;
    }
    public void setUmur(int umurMhs){
        this.umur = umurMhs;
        
    }
     public int getUmur(){
        return umur;
    }
    public void setIpk(double ipkMhs){
        this.ipk = ipkMhs;
    }
    public double getIpk(){
        return ipk;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    public String statusKelulusan(){
        if (ipk >= 2.75){
           return "Lulus"; 
        }
        else{
            return "Tidak Lulus";
        }
    }
   //Method Tampil Info
    public void TampilanInfo(){
        System.out.println("Nama    :"+nama);
        System.out.println("Nim     :"+nim);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Umur    :"+umur);
        System.out.println("Ipk     :"+ipk);
    
     }
    
}
