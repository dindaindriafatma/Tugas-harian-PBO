/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class MainKendaraan {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);


        System.out.println("=== RENTAL KENDARAAN ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bus");
        System.out.print("Pilih : ");

        int pilih =input.nextInt();
        input.nextLine();


        System.out.print("Masukkan No Polisi : ");
        String nopol =input.nextLine();
        System.out.print("Lama rental (hari): ");

        int hari = input.nextInt();

        Kendaraan kendaraan = null;

        switch(pilih){
            case 1:
                
                kendaraan = new Mobil(nopol,hari);
                break;
            case 2:

                kendaraan = new Motor(nopol,hari);
                break;

            case 3:

                kendaraan = new Bus(nopol,hari);

                break;



            default:

                System.out.println("Pilihan salah");

        }



        if(kendaraan != null){
            kendaraan.hitungBiayaRental();

        }


        input.close();

    }

}
