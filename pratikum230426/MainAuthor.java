/*
Pembuat : Dinda Indria Fatma
Nim     : 2501081010
Tanggal : 23-April-2026
Program :  Komposisi Author dan Book
 */
package Pratikum230426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainAuthor {
    public static void main(String[]args){
        author Din = new author ("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Din);
        
        Din.setEmail("peter@nowhere.com");
        System.out.println(Din);
        System.out.println("Name:"+Din.getNama());
        System.out.println("gender:"+Din.getGender());
        System.out.println("Gmail:"+Din.getEmail());
        
    }
    
}