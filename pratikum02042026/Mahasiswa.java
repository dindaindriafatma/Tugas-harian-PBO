/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum02042026;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    
   String nama;
   String nobp;
   double tugas,UTS,UAS;
   
   Mahasiswa(){
   }
   
   Mahasiswa(double tgs,double uts,double uas){
       tugas=tgs;
       UTS=uts;
       UAS=uas;
   }
   double NilaiAkhir(){
       return((0.25 * tugas) + (0.35 *UTS)+ (0.40 *UAS));
   }
   void TampilData(){
       System.out.println("Nilai TUGAS"+tugas);
       System.out.println("Nilai UAS= "+UAS);
       System.out.println("Nilai UTS= "+UTS);
       System.out.println("Total nilai  akhir mahasiswa= "+NilaiAkhir());
   }
    
}
