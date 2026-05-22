/*
 Nama=Dinda Indria Fatma
NIM=2501081010
 */
package pratikum02042026;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class mainMahasiswa {
     public static  void main(String[]args){
         
         Mahasiswa pp1 = new Mahasiswa();
         pp1.nama="Dinda Indria Fatma";
         pp1.nobp="2501081010";
         pp1.UAS=95.7;
         pp1.UTS=90.6;
         pp1.tugas=94.5;
         
         System.out.println("akses method dalam main class ");
         System.out.println("Object 1 menggunakan constructor 1");
         System.out.println("Total nilai  akhir mahasiswa= "+pp1.NilaiAkhir());
         System.out.println();
         pp1.TampilData();
         
     
         
          
        System.out.println("\nObject 2 menggunakan constructor 2");
        System.out.println("Nilai Mahasiswa");
        
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Nama= ");
         String nm=input.nextLine();
         System.out.print("Masukkan NoBp= ");
         String nbp=input.nextLine();
         System.out.print("Masukkan nilai UAS= ");
         double uas=input.nextDouble();
         System.out.print("Masukkan nilai UTS= ");
         double uts=input.nextDouble();
         System.out.print("Masukkan nilai tugas= ");
         double tugas=input.nextDouble();
         Mahasiswa pp2 = new Mahasiswa(uas,uts,tugas);
         System.out.println();
         pp2.TampilData();
         
    
         
     }
    
}
