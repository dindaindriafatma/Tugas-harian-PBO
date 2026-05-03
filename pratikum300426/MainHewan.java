/*
 * NAMA:DINDA INDRIA FATMA
 * NIM:2501081010
 */
package pratikum300426;

/**
 *
 * @author USER
 */
public class MainHewan {
    public static void main(String[] args){
        hewan hewanUmum = new hewan ("makhluk");
        Kucing kucingKu = new Kucing ("molly");
        Anjing anjingku = new Anjing ("black");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        
        kucingKu.tampilkanNama();
        kucingKu.bersuara();
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
         
        System.out.println();
        
        
    }
    
}
