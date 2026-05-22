/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum09042026;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class mainMahasiswaEnkapsulasi {
     public static void main(String []args){
        
        
        MahasiswaEnkapsulasi pp1 = new MahasiswaEnkapsulasi();
        System.out.print("\nJumlah Objek:"+MahasiswaEnkapsulasi.getJumlahObjek());
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 1 menggunakan konstruuktor 1");
        
        pp1.setNama ("Mutiara Yulianda");
        pp1.setNim ("250108xxxx");
        pp1.setJurusan ("Teknologi Informasi");
        pp1.setUmur (18);
        pp1.setIpk(2.50);
 
        System.out.println();
        pp1.TampilanInfo();
        System.out.println("Status Kelulusan : "+pp1.statusKelulusan());
        
        
         // Object pp2 menggunakan constructor 2
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 2 menggunakan konstruuktor 2");
        MahasiswaEnkapsulasi pp2 = new MahasiswaEnkapsulasi("Mutiara Yuliand", "250108xxxx", "Teknologi Informasi", 18, 4.0);
       
        System.out.println();
        pp2.TampilanInfo();
        System.out.println("Status Kelulusan : "+pp2.statusKelulusan());
        
                        
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 3 menggunakan kontruuktor 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama    : ");
        String nm = input.nextLine();
        System.out.print("Masukkan Nim     : ");
        String nimmhs = input.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String jrsn = input.nextLine();
        System.out.print("Masukkan Umur    : ");
        int umr = input.nextInt();
        System.out.print("Masukkan IPK     : ");
        double ipkmhs = input.nextDouble();
        
        MahasiswaEnkapsulasi pp3 = new MahasiswaEnkapsulasi (nm,nimmhs, jrsn, umr, ipkmhs);
        System.out.println();
        pp3.TampilanInfo();
        System.out.println("Status Kelulusan : "+pp3.statusKelulusan());
        System.out.print("Jumlah Objek:"+MahasiswaEnkapsulasi.getJumlahObjek());
    }
    
    
}
