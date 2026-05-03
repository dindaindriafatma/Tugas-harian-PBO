/*
 * NAMA:DINDA INDRIA FATMA
 * NIM:2501081010
 */
package pratikum300426;

/**
 *
 * @author USER
 */
public class Anjing extends hewan {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama + "berkata: Guk guk!!");
    }
    
}
