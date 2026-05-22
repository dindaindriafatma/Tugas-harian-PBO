/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */

public class KaryawanTetap extends Karyawan {

    private int golongan;
    private String namaGolongan;
    private double gajiPokok;


    public KaryawanTetap(int golonga,String nik,String nama) {
        super(nik, nama);
        setGolongan(golongan);
    }


    public int getGolongan() {
        return golongan;
    }


    public void setGolongan(int golongan) {
        this.golongan = golongan;
        
        if(golongan == 1){

            this.namaGolongan = "Junior";
            this.gajiPokok = 3000000;

        }

        else if(golongan == 2){

            this.namaGolongan = "Staff";
            this.gajiPokok = 5000000;

        }

        else if(golongan == 3){

            this.namaGolongan = "Senior";
            this.gajiPokok = 7000000;

        }

        else{

            this.namaGolongan = "Tidak Ada";
            this.gajiPokok = 0;

        }

    }


    public String getNamaGolongan() {
        return namaGolongan;
    }

    public void setNamaGolongan(String namaGolongan) {
        this.namaGolongan = namaGolongan;
    }
    

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }



    @Override
    public void hitungGaji(){

        double tunjangan =0.12 * gajiPokok;
        double total =gajiPokok + tunjangan;


        System.out.println("\n=== Karyawan Tetap ===");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Golongan : " + namaGolongan);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan : Rp" + tunjangan);
        System.out.println("Total Gaji : Rp" + total);
    }

}