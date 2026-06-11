/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum110626;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class cekArray {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int[] angka = {10,20,30,40,50};
      try{
         System.out.print("Mau di tampilkan array index ke berapa= ");
         int index = input.nextInt();
         System.out.println("Nilai Array Adalah= "+angka[index]);
         System.out.print("Mau dibagi berapa?");
         int n=input.nextInt();
         int hasil = angka[index]/n;
         System.out.println("Hasil Pembagian= "+hasil);
      }
       catch(InputMismatchException ex){
         System.out.println("Pastikan Input berupa bilangan bulat!"); 
        
        }
      catch(ArithmeticException e){
          System.out.println("Angka pembagian tidak boleh 0!");
          
      }
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Index diluar range array!");
      }
      finally{
          System.out.println("----Tampilkan array----");
          System.out.println("Cara 1 = ");
          for(int i=0;i<angka.length;i++)
              System.out.print(" "+angka[i]);
          System.out.println();
          System.out.println("Cara 2= ");
          System.out.println("Isi array= "+Arrays.toString(angka));
      }
    }
       
}
