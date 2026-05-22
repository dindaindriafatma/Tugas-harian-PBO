/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum02042026;

/**
 *
 * @author USERpp1.
 */
import java.util.Scanner;
public class mainPersegiPanjang {
    
    public static  void main(String[]args){
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang=10;
        pp1.lebar=7;
        System.out.println("akses method dalam main class ");
        System.out.println("Luas persegi panjang= "+pp1.HitungLuas());
        System.out.println("Keliling persegi panjang= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
        //object pp2 menggunakan constructor 2
        System.out.println("Object 2 menggunakan constructor 2 ");
        PersegiPanjang pp2 = new PersegiPanjang(19,20);
        System.out.println("akses method dalam main class ");
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
        
        PersegiPanjang pp3 = new PersegiPanjang(p,l);
        pp3.TampilData();
        
        
    }
    
}
