/*
 * NAMA:DINDA INDRIA FATMA
 * NIM:2501081010
 */
package pratikum300426;

/**
 *
 * @author USER
 */
public class Kucing extends hewan {
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama + "berkata:Meong!!");
    }
     
    
}
