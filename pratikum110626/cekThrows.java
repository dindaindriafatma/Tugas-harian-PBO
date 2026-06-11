/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum110626;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class cekThrows {
    //method exception
    public static void cekAngka(int a)throws Exception{
        //body throw
        if(a<0){
            throw new Exception ("Nilai tidak boleh negatif");
            
        }else if (a>100){
            throw new Exception ("Nilai tidak boleh melebihi 100");
        }
    }
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka= ");
        int angka = in.nextInt();
      try{
          cekAngka(angka);
          System.out.println("Nilai berhasil disimpan!");
      }
      catch(Exception ex){
          System.out.println("Error "+ex.getMessage());
      }
    }
    
}
