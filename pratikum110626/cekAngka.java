/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum110626;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class cekAngka {
    
    public static void main(String[] args){
        //TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b;
        int hasil;
     try{
        System.out.print("Masukkan bilangan pertama : ");
        a=input.nextInt();
        System.out.print("Masukkan bilangan Kedua : ");
        b=input.nextInt();
        hasil = a/b;
        System.out.println(a+" / "+b+" = "+hasil);
        }
     catch(InputMismatchException e){
         System.out.println("Masukkan nilai berupa angka !"); 
        
        }
     catch(ArithmeticException e){
         
            System.out.println("Nilai ke 2/penyebut tidak boleh 0!");
        }
     catch(Exception e){
         
        System.out.println("Error tidak terduga "+e.getMessage());  
     }
     finally{
         
        System.out.println("Pegecekan nilai selesai"); 
        
        }
    }
    
}
