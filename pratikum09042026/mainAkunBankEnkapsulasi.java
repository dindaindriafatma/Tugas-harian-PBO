/*
Nama:Dinda Indria Fatma
NIM:2501081010
 */
package pratikum09042026;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class mainAkunBankEnkapsulasi {
   public static void main(String[]args){
       AkunBankEnkapsulasi pp1 = new AkunBankEnkapsulasi();
       pp1.setNama("Dinda");
       pp1.setNoRekening("000001");
       pp1.setSaldo(1000000);
       pp1.TampilkanInfo();
       
       System.out.println();
       Scanner input = new Scanner(System.in);
       System.out.print("\nMasukkan Jumlah Deposit= ");
       double deposit = input.nextDouble();
       pp1.deposit(deposit);
       pp1.TampilkanInfo();
        System.out.print("\nMasukkan Jumlah Withdraw= ");
        double withdraw = input.nextDouble();
        pp1.withdraw(withdraw);
        pp1.TampilkanInfo();
        System.out.println();
        
        System.out.print("MAsukkan Jumlah Deposit= ");
        double depositt = input.nextDouble();
        System.out.print("Masukkan jumlah Withdraw= ");
        withdraw = input.nextDouble();
        AkunBankEnkapsulasi pp2 = new AkunBankEnkapsulasi("00000","Dinda",1000000);
        pp2.deposit(depositt);
        pp2.withdraw(withdraw);
        pp2.TampilkanInfo();
        
   }
   
    
}
