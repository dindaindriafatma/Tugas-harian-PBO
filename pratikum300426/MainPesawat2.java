/*
 * NAMA:DINDA INDRIA FATMA
 * NIM:2501081010
 */
package pratikum300426;

/**
 * 
 *
 * @author USER
 */
import java.util.Scanner;
public class MainPesawat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesawat: ");
        int jumlah = input.nextInt();
        input.nextLine(); //Buang newline
        
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        for (int i = 0; i < jumlah; i++){
            System.out.print("\n === Input Data Pesawat ke-" + (i + 1) + "===");
            
            System.out.print("\nNama Pesawat: ");
            String nama = input.nextLine();
            
            System.out.print("Tahun Produksi: ");
            int tahunProduksi = input.nextInt();
            
            System.out.print("Menggunakan Mesin? (true/false): ");
            boolean mesin = input.nextBoolean();
            
            System.out.print("Muatan (Jumlah Penumpang): ");
            int muatan = input.nextInt();
            input.nextLine();
            
            daftarPesawat[i] = new Pesawat (nama, tahunProduksi, mesin, muatan);
            
        }
        
        System.out.println("\n === DAFTAR PESAWAT ===");
        System.out.println(">> Pesawat ke- 1");
        daftarPesawat[0].cetak();
    
        int max = daftarPesawat[0].getMuatan();
        String maxnama = daftarPesawat[0].getNama();
        for (int i = 1;i < daftarPesawat.length; i++){
            System.out.println("\n >> Pesawat ke-" + (i + 1));
            daftarPesawat[i].cetak();
            if(daftarPesawat [i].getMuatan()>max)
            {
                max = daftarPesawat[i].getMuatan();
                maxnama = daftarPesawat[i].getNama();
            }
            System.out.println();
        }
    }
    
}