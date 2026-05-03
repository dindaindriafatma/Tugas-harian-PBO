/*
 * NAMA:DINDA INDRIA FATMA
 * NIM:2501081010
 */
package pratikum300426;

/**
 *
 * @author USER
 */
public class Udara extends Kendaraan {
    private boolean mesin;
    
    public Udara(){
        super();
    }
    
    public Udara(String nama,int thnProduksi, boolean mesin){
        super(nama,thnProduksi);
        this.mesin=mesin;
    }
    public boolean getMesin(){
    return mesin;
    } 
    public void  setMesin(boolean mesin){
        this.mesin=mesin;
    }
    
    
    @Override
    public void cetak(){
        
        System.out.println("Menggnakan Mesin:"+(mesin ?"ya":"Tidak"));
    }
            
   
}