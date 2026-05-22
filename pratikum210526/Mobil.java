/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */

public class Mobil extends Kendaraan {

    private int hari;
    private double biayaRental;


    public Mobil(String noPolisi,int hari){
     super(noPolisi);

        this.hari = hari;
        biayaRental = 500000;
    }


    @Override
    public void hitungBiayaRental(){

        double total =
                biayaRental *
                hari;


        System.out.println("\n=== Rental Mobil ===");
        System.out.println("No Polisi : " + noPolisi);
        System.out.println("Lama Rental : " + hari + " hari");
        System.out.println("Total : Rp" + total);

    }

}
