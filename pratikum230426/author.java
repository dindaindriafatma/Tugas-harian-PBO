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
public class author {
    
    private String nama;
    private String email;
    private final char gender;
    
    author(String nama, String email, char gender){
        this.nama = nama;
        this.email = email;
        this.gender = gender;
    }

    public String getNama(){
        return  nama;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String nama){
        this.nama=nama;
    }
    public void setEmail(String email){
        this.email = email;
    }
   
    public String toString() {
    return nama + " (" + gender + ") at " + email;
}
}