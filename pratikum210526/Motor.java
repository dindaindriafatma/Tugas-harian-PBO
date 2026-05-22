/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */

public class Motor extends Kendaraan {

    private int hari;
    private double biayaRental;


    public Motor(String noPolisi, int hari){
        super(noPolisi);

        this.hari = hari;
        biayaRental = 100000;
    }


    @Override
    public void hitungBiayaRental(){

        double total = biayaRental * hari;


        System.out.println("\n=== Rental Motor ===");
        System.out.println("No Polisi : "+ noPolisi);
        System.out.println("Lama Rental : " + hari + " hari");
        System.out.println("Total : Rp" + total);

    }

}
