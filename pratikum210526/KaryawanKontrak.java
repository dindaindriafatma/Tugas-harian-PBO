/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */
public class KaryawanKontrak extends Karyawan {

    private double honor;
    private double uangMakan;


    public KaryawanKontrak(
            double honor,
            String nik,
            String nama) {

        super(nik, nama);

        this.honor = honor;
        this.uangMakan = 300000;
    }


    public double getHonor() {
        return honor;
    }


    public void setHonor(double honor) {
        this.honor = honor;
    }


    public double getUangMakan() {
        return uangMakan;
    }


    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }



    @Override
    public void hitungGaji() {

        double total =honor + uangMakan;


        System.out.println("\n=== Karyawan Kontrak ===");

        System.out.println("NIK : " + nik);

        System.out.println("Nama : " + nama);

        System.out.println("Honor : Rp" + honor);

        System.out.println("Uang Makan : Rp" + uangMakan);

        System.out.println("Total Gaji : Rp" + total);

    }

}
