/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum02042026;

/**
 *
 * @author USER
 */
public class PersegiPanjang {///public acces modifier
    //atribut variabel
        int panjang;
        int lebar;
       
        
        //constructor kosong   
        PersegiPanjang(){
            
        }
        
        //constructor 2-overloading
        PersegiPanjang(int p, int l){
            panjang=p;
            lebar=l;
            
        }
        
        //method dengan nilai kembalian
        int HitungLuas(){
            return(panjang*lebar);
        }
         
        int HitungKel(){
            return(2*(panjang+lebar));
        }
        
        void TampilData(){
            System.out.println("Panjang persegi panjang= "+panjang);
            System.out.println("Lebar persegi panjang= "+lebar);
            System.out.println("Luas persegi panjang= "+HitungLuas());
            System.out.println("Keliling persegi panjang= "+HitungKel());
        }
    }

