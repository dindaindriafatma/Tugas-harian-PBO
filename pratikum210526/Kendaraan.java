/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum210526;

/**
 *
 * @author USER
 */
public abstract class Kendaraan {

    protected String noPolisi;

    public Kendaraan(String noPolisi) {
        this.noPolisi = noPolisi;
    }


    public String getNoPolisi() {
        return noPolisi;
    }


    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }


    // abstract method
    public abstract void hitungBiayaRental();

}
