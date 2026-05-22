/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainKaryawan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("=== SISTEM GAJI ===");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilih : ");

        int pilih = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan NIK : ");
        String nik =input.nextLine();


        System.out.print("Masukkan Nama : ");

        String nama =input.nextLine();


        Karyawan karyawan =null;



        switch(pilih){

            case 1:

                System.out.println("1 = Junior");
                System.out.println("2 = Staff");
                System.out.println("3 = Senior");
                System.out.print("Masukkan golongan : ");

                int gol =input.nextInt();
                
                karyawan =new KaryawanTetap(gol,nik,nama);

                break;



            case 2:

                System.out.print(
                        "Masukkan honor : ");

                double honor =
                        input.nextDouble();


                karyawan =
                        new KaryawanKontrak(honor,nik,nama);

                break;



            default:

                System.out.println(
                        "Pilihan salah");

        }

        if(karyawan != null){

            karyawan.hitungGaji();

        }


        input.close();

    

    }
    
}
