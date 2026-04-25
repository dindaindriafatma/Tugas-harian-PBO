/*
Pembuat : Dinda Indria Fatma
Nim     : 2501081010
Tanggal : 23-April-2026
Program : Komposisi Author dan Book
 */
package Pratikum230426;

/**
 *
 * @author Mutiara Yulianda
 */
public class book {
    private  final String nama;
    private  final author Author;
    private double price;
    private int qty;
    
    book( String nama, author Author, double price, int qty){
        this.nama = nama;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }
    public String getNama(){
        return nama;
    }
    public  author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    public String toString(){
        return " ' " + nama + "' by "+ Author;
    }
    
}