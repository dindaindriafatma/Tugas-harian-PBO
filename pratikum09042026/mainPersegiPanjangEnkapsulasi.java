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
public class mainPersegiPanjangEnkapsulasi {
     public static  void main(String[]args){
        System.out.print("\nJumlah Objek: "+ PersegiPanjangEnkapsulasi.getJumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar(7);
        System.out.println("\nakses method dalam main class ");
        System.out.println("Luas persegi panjang= "+pp1.HitungLuas());
        System.out.println("Keliling persegi panjang= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
        //object pp2 menggunakan constructor 2
        System.out.println("Object 2 menggunakan constructor 2 ");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19,20);
        System.out.println("\nakses method dalam main class ");
        System.out.println("Luas persegi panjang= "+pp2.HitungLuas());
        System.out.println("Keliling  persegi panjang=  "+pp2.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        //object pp3 menggunakan constructor 2
        System.out.println("\nObject 3 menggunakan constructor 3");
        System.out.println("Panjang dan Lebar input user");
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang= ");
       int p=input.nextInt();
        
        System.out.print("Masukkan lebar= ");
       int l=input.nextInt();
        
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(p,l);
        pp3.TampilData();
        System.out.print("Jumlah Objek: "+ PersegiPanjangEnkapsulasi.getJumlahObjek());

     }
}
