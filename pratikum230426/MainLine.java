/*
Pembuat : Dinda Indria Fatma
Nim     : 2501081010
Tanggal : 23-April-2026
Program : Komposisi Point dan Line
*/

package pratikum230426;


/**
 *
 * @author Mutiara Yulianda
 */
public class MainLine {
    public static void main(String[]args){
    point Din = new point(1,2);
    System.out.println(Din);
     
    line dummyLine = new line(1, 2, 3, 4);
    System.out.println(dummyLine);
    dummyLine.setBeginXY(3,9);
    dummyLine.setEndXY(4,8);
     
    System.out.println("Line is: " + dummyLine);
    System.out.println("Begin Point: " + dummyLine.getBegin());
    System.out.println("End Point: " + dummyLine.getEnd());
    System.out.println("Begin X: " + dummyLine.getBegin().getX());
    System.out.println("Begin Y: " + dummyLine.getBegin().getY());
    System.out.println("End X: " + dummyLine.getEnd().getX());
    System.out.println("End Y: " + dummyLine.getEnd().getY());
    System.out.println("Length: " + dummyLine.getLength());
     

    }
}