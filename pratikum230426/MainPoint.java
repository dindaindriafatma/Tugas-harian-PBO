/*
Pembuat : Dinda Indria Fatma
Nim     : 2501081010
Tanggal : 23-April-2026
Program : Komposisi Point dan Line
 */

package pratikum230426;

/**
 *
 * @author USER
 */
public class MainPoint {
    public static void main(String[]args){
       point Din = new point (1,2);
       System.out.println(Din);
       
        Din.setX(6);
        Din.setY(2);
        System.out.println(Din);
        System.out.println("X  : "+Din.getX());
        System.out.println("Y  : "+Din.getY());
        int[] xy = Din.getXY();
        System.out.println("XY :(" + xy[0] + "," + xy[1] + ")"); 
        
        
       
   } 
    
    
}
