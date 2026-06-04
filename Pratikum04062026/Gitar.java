/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum04062026;

/**
 *
 * @author USER
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(int jumlahSenar,String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar= jumlahSenar;
        
    }
    
    @Override
    public void mainkan(){
        System.out.println(nama+ "di petik dengan +"+jumlahSenar+" senar. ");
        
    }

    @Override
    public void stem() {
         System.out.println("Menyetam gitar"+nama+"secara manual ");
        
    }
    public int getjumlahSenar(){
        return jumlahSenar;
    }
    
}
